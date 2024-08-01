// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmMonitorRequest extends TeaModel {
    /**
     * <p>The maximum number of consecutive exceptions detected. If the number of consecutive exceptions detected reaches the maximum number, the application service is deemed abnormal.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The health check interval. Unit: seconds. Set the value to 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The monitored nodes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IspCityNode")
    public java.util.List<UpdateGtmMonitorRequestIspCityNode> ispCityNode;

    /**
     * <p>The language of the values of specific response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the health check configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234abc</p>
     */
    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    /**
     * <p>The extended information, that is, the parameters required for the protocol. Different protocols require different parameters:</p>
     * <p>HTTP or HTTPS:</p>
     * <ul>
     * <li>port: the port to check.</li>
     * <li>failureRate: the failure rate.</li>
     * <li>code: the status code threshold. If the returned status code is greater than the specified threshold, the application service is deemed abnormal. Valid values: 400 and 500.</li>
     * <li>host: the host configuration.</li>
     * <li>path: the health check URL.</li>
     * </ul>
     * <p>PING:</p>
     * <ul>
     * <li>packetNum: the number of ping packets.</li>
     * <li>packetLossRate: the loss rate of ping packets.</li>
     * <li>failureRate: the failure rate.</li>
     * </ul>
     * <p>TCP:</p>
     * <ul>
     * <li>port: the port to check.</li>
     * <li>failureRate: the failure rate.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;code\&quot;:200,\&quot;path\&quot;:\&quot;\\index.htm\&quot;,\&quot;host\&quot;:\&quot;aliyun.com\&quot;}</p>
     */
    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    /**
     * <p>The protocol used for the health check.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The health check timeout period. Unit: milliseconds. Valid values: 2000, 3000, 5000, and 10000.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static UpdateGtmMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmMonitorRequest self = new UpdateGtmMonitorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGtmMonitorRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public UpdateGtmMonitorRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public UpdateGtmMonitorRequest setIspCityNode(java.util.List<UpdateGtmMonitorRequestIspCityNode> ispCityNode) {
        this.ispCityNode = ispCityNode;
        return this;
    }
    public java.util.List<UpdateGtmMonitorRequestIspCityNode> getIspCityNode() {
        return this.ispCityNode;
    }

    public UpdateGtmMonitorRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateGtmMonitorRequest setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public UpdateGtmMonitorRequest setMonitorExtendInfo(String monitorExtendInfo) {
        this.monitorExtendInfo = monitorExtendInfo;
        return this;
    }
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    public UpdateGtmMonitorRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public UpdateGtmMonitorRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class UpdateGtmMonitorRequestIspCityNode extends TeaModel {
        /**
         * <p>The code of the city where the monitored node is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>572</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <ul>
         * <li>The code of the Internet service provider (ISP) to which the monitored node belongs. For more information about specific values, see the response parameters of DescribeGtmMonitorAvailableConfig.</li>
         * <li>If the value of the GroupType parameter is BGP or OVERSEAS, IspCode is optional. The default value is 465.</li>
         * <li>If the value of the GroupType parameter is not BGP or OVERSEAS, IspCode is required and is used together with CityCode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>465</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        public static UpdateGtmMonitorRequestIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            UpdateGtmMonitorRequestIspCityNode self = new UpdateGtmMonitorRequestIspCityNode();
            return TeaModel.build(map, self);
        }

        public UpdateGtmMonitorRequestIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public UpdateGtmMonitorRequestIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

    }

}
