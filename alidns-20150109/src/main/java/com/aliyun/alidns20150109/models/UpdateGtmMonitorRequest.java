// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmMonitorRequest extends TeaModel {
    /**
     * <p>The number of consecutive health checks.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The interval between health checks. Unit: seconds. The value must be 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The list of monitoring nodes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IspCityNode")
    public java.util.List<UpdateGtmMonitorRequestIspCityNode> ispCityNode;

    /**
     * <p>The language of the response.</p>
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
     * <p>The extended information. The parameters vary based on the protocol.</p>
     * <p>HTTP and HTTPS:</p>
     * <ul>
     * <li><p>port: The health check port.</p>
     * </li>
     * <li><p>failureRate: The failure rate.</p>
     * </li>
     * <li><p>code: The return code. A response with a status code greater than the specified value is considered abnormal. Valid values: 400 and 500.</p>
     * </li>
     * <li><p>host: The host settings.</p>
     * </li>
     * <li><p>path: The URL path.</p>
     * </li>
     * </ul>
     * <p>PING:</p>
     * <ul>
     * <li><p>packetNum: The number of ping packets.</p>
     * </li>
     * <li><p>packetLossRate: The packet loss rate.</p>
     * </li>
     * <li><p>failureRate: The failure rate.</p>
     * </li>
     * </ul>
     * <p>TCP:</p>
     * <ul>
     * <li><p>port: The health check port.</p>
     * </li>
     * <li><p>failureRate: The failure rate.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;code\&quot;:200,\&quot;path\&quot;:\&quot;\\index.htm\&quot;,\&quot;host\&quot;:\&quot;aliyun.com\&quot;}</p>
     */
    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    /**
     * <p>The health check protocol.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The timeout period for a health check. Unit: milliseconds. Valid values: 2000, 3000, 5000, and 10000.</p>
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
         * <p>The city code.</p>
         * 
         * <strong>example:</strong>
         * <p>572</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <ul>
         * <li><p>For more information about the valid values, see the response of the DescribeGtmMonitorAvailableConfig operation.</p>
         * </li>
         * <li><p>If GroupType is set to Border Gateway Protocol (BGP) or Overseas, IspCityNode.N.IspCode is optional. The default value is 465.</p>
         * </li>
         * <li><p>If GroupType is not set to BGP or Overseas, IspCityNode.N.IspCode is required. You must specify a value that matches the value of IspCityNode.N.CityCode.</p>
         * </li>
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
