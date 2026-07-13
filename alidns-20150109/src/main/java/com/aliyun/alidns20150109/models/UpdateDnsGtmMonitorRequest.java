// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmMonitorRequest extends TeaModel {
    /**
     * <p>The number of consecutive health checks.</p>
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
     * <p>The list of city nodes for health checks.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IspCityNode")
    public java.util.List<UpdateDnsGtmMonitorRequestIspCityNode> ispCityNode;

    /**
     * <p>The language of the response. Default value: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the health check configuration. You can call the <a href="https://www.alibabacloud.com/help/en/dns/api-alidns-2015-01-09-describednsgtminstanceaddresspool">DescribeDnsGtmInstanceAddressPool</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Monito******</p>
     */
    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    /**
     * <p>The extended information. The required parameters vary based on the health check protocol.</p>
     * <ul>
     * <li><p>HTTP(S):</p>
     * <ul>
     * <li><p>port: The port for the health check.</p>
     * </li>
     * <li><p>host: The Host header.</p>
     * </li>
     * <li><p>path: The URL path.</p>
     * </li>
     * <li><p>code: The health check is considered abnormal if the returned status code is greater than the specified value. For example, if you set this parameter to 400, a returned status code of 404 is considered abnormal.</p>
     * </li>
     * <li><p>failureRate: The failure rate.</p>
     * </li>
     * <li><p>sni: Specifies whether to enable Server Name Indication (SNI). This parameter is available only for the HTTPS protocol.</p>
     * <ul>
     * <li><p>true: Enable SNI.</p>
     * </li>
     * <li><p>false: Disable SNI.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>nodeType: The type of the node for health checks when the address pool type is DOMAIN.</p>
     * <ul>
     * <li><p>IPV4</p>
     * </li>
     * <li><p>IPV6</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li><p>PING:</p>
     * <ul>
     * <li><p>failureRate: The failure rate.</p>
     * </li>
     * <li><p>packetNum: The number of ping packets.</p>
     * </li>
     * <li><p>packetLossRate: The packet loss rate.</p>
     * </li>
     * <li><p>nodeType: The type of the node for health checks when the address pool type is DOMAIN.</p>
     * <ul>
     * <li><p>IPV4</p>
     * </li>
     * <li><p>IPV6</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li><p>TCP:</p>
     * <ul>
     * <li><p>port: The port for the health check.</p>
     * </li>
     * <li><p>failureRate: The failure rate.</p>
     * </li>
     * <li><p>nodeType: The type of the node for health checks when the address pool type is DOMAIN.</p>
     * <ul>
     * <li><p>IPV4</p>
     * </li>
     * <li><p>IPV6</p>
     * </li>
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
     * <li><p>HTTP</p>
     * </li>
     * <li><p>HTTPS</p>
     * </li>
     * <li><p>PING</p>
     * </li>
     * <li><p>TCP</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The timeout period for a health check. Unit: milliseconds.</p>
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
         * <p>The city code of the health check node.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>The carrier code of the health check node.</p>
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
