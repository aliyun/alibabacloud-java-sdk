// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmMonitorRequest extends TeaModel {
    /**
     * <p>The maximum number of consecutive exceptions detected. If the number of consecutive exceptions detected reaches the maximum number, the application service is deemed abnormal.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The health check interval. Unit: seconds.</p>
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
    public java.util.List<UpdateDnsGtmMonitorRequestIspCityNode> ispCityNode;

    /**
     * <p>The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
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
     * <p>MonitorConfigId1</p>
     */
    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    /**
     * <p>The extended information. The required parameters vary based on the health check protocol.</p>
     * <ul>
     * <li><p>HTTP or HTTPS</p>
     * <ul>
     * <li><p>port: the port that you want to check</p>
     * </li>
     * <li><p>host: the host settings</p>
     * </li>
     * <li><p>path: the URL path</p>
     * </li>
     * <li><p>code: the return code. If the return value of code is greater than the specified value, the health check result is deemed abnormal. For example, if code is set to 400 and the code 404 is returned, the health check result is deemed abnormal.</p>
     * </li>
     * <li><p>failureRate: the failure rate</p>
     * </li>
     * <li><p>sni: specifies whether to enable server name indication (SNI). This parameter is available only when ProtocolType is set to HTTPS. Valid values:</p>
     * <ul>
     * <li>true: enables SNI.</li>
     * <li>false: disables SNI.</li>
     * </ul>
     * </li>
     * <li><p>nodeType: the type of the monitoring node when the address pool type is domain name. Valid values:</p>
     * <ul>
     * <li>IPV4</li>
     * <li>IPV6</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li><p>PING</p>
     * <ul>
     * <li><p>failureRate: the failure rate</p>
     * </li>
     * <li><p>packetNum: the number of ping packets</p>
     * </li>
     * <li><p>packetLossRate: the loss rate of ping packets</p>
     * </li>
     * <li><p>nodeType: the type of the monitoring node when the address pool type is domain name. Valid values:</p>
     * <ul>
     * <li>IPV4</li>
     * <li>IPV6</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li><p>TCP</p>
     * <ul>
     * <li><p>port: the port that you want to check</p>
     * </li>
     * <li><p>failureRate: the failure rate</p>
     * </li>
     * <li><p>nodeType: the type of the monitoring node when the address pool type is domain name. Valid values:</p>
     * <ul>
     * <li>IPV4</li>
     * <li>IPV6</li>
     * </ul>
     * </li>
     * </ul>
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
     * <p>The protocol used for the health check. Valid values:</p>
     * <ul>
     * <li>HTTP</li>
     * <li>HTTPS</li>
     * <li>PING</li>
     * <li>TCP</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The timeout period. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static UpdateDnsGtmMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmMonitorRequest self = new UpdateDnsGtmMonitorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmMonitorRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public UpdateDnsGtmMonitorRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public UpdateDnsGtmMonitorRequest setIspCityNode(java.util.List<UpdateDnsGtmMonitorRequestIspCityNode> ispCityNode) {
        this.ispCityNode = ispCityNode;
        return this;
    }
    public java.util.List<UpdateDnsGtmMonitorRequestIspCityNode> getIspCityNode() {
        return this.ispCityNode;
    }

    public UpdateDnsGtmMonitorRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDnsGtmMonitorRequest setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public UpdateDnsGtmMonitorRequest setMonitorExtendInfo(String monitorExtendInfo) {
        this.monitorExtendInfo = monitorExtendInfo;
        return this;
    }
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    public UpdateDnsGtmMonitorRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public UpdateDnsGtmMonitorRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class UpdateDnsGtmMonitorRequestIspCityNode extends TeaModel {
        /**
         * <p>The code of the city where the monitored node is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>The code of the Internet service provider (ISP) to which the monitored node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        public static UpdateDnsGtmMonitorRequestIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            UpdateDnsGtmMonitorRequestIspCityNode self = new UpdateDnsGtmMonitorRequestIspCityNode();
            return TeaModel.build(map, self);
        }

        public UpdateDnsGtmMonitorRequestIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public UpdateDnsGtmMonitorRequestIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

    }

}
