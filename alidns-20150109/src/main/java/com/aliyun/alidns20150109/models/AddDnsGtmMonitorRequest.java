// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmMonitorRequest extends TeaModel {
    /**
     * <p>The ID of the address pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pool1</p>
     */
    @NameInMap("AddrPoolId")
    public String addrPoolId;

    /**
     * <p>The maximum number of consecutive exceptions detected. If the number of consecutive exceptions detected reaches the maximum number, the application service is deemed abnormal.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The health check interval. Unit: seconds.</p>
     * <p>This parameter is required.</p>
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
    public java.util.List<AddDnsGtmMonitorRequestIspCityNode> ispCityNode;

    /**
     * <p>The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The extended information. The required parameters vary based on the value of ProtocolType.</p>
     * <ul>
     * <li><p>HTTP or HTTPS</p>
     * <ul>
     * <li><p>port: the port that you want to check</p>
     * </li>
     * <li><p>host: the host settings</p>
     * </li>
     * <li><p>path: the URL path</p>
     * </li>
     * <li><p>code: the response code. The health check result is deemed abnormal if the returned value is greater than the specified value.</p>
     * </li>
     * <li><p>failureRate: the failure rate</p>
     * </li>
     * <li><p>sni: specifies whether to enable server name indication (SNI). This parameter is available only when ProtocolType is set to HTTPS. Valid values:</p>
     * <ul>
     * <li>true: enables SNI.</li>
     * <li>false: disables SNI.</li>
     * </ul>
     * </li>
     * <li><p>nodeType: the type of the node for monitoring when Type is set to DOMAIN. Valid values:</p>
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
     * <li><p>nodeType: the type of the node for monitoring when Type is set to DOMAIN. Valid values:</p>
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
     * <li><p>nodeType: the type of the node for monitoring when Type is set to DOMAIN. Valid values:</p>
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
     * <p>The health check protocol. Valid values:</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30000</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static AddDnsGtmMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDnsGtmMonitorRequest self = new AddDnsGtmMonitorRequest();
        return TeaModel.build(map, self);
    }

    public AddDnsGtmMonitorRequest setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public AddDnsGtmMonitorRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public AddDnsGtmMonitorRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public AddDnsGtmMonitorRequest setIspCityNode(java.util.List<AddDnsGtmMonitorRequestIspCityNode> ispCityNode) {
        this.ispCityNode = ispCityNode;
        return this;
    }
    public java.util.List<AddDnsGtmMonitorRequestIspCityNode> getIspCityNode() {
        return this.ispCityNode;
    }

    public AddDnsGtmMonitorRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddDnsGtmMonitorRequest setMonitorExtendInfo(String monitorExtendInfo) {
        this.monitorExtendInfo = monitorExtendInfo;
        return this;
    }
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    public AddDnsGtmMonitorRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public AddDnsGtmMonitorRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class AddDnsGtmMonitorRequestIspCityNode extends TeaModel {
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

        public static AddDnsGtmMonitorRequestIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            AddDnsGtmMonitorRequestIspCityNode self = new AddDnsGtmMonitorRequestIspCityNode();
            return TeaModel.build(map, self);
        }

        public AddDnsGtmMonitorRequestIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public AddDnsGtmMonitorRequestIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

    }

}
