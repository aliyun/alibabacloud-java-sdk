// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmMonitorRequest extends TeaModel {
    /**
     * <p>The ID of the address pool. You can call the <a href="https://www.alibabacloud.com/help/en/dns/api-alidns-2015-01-09-describednsgtminstanceaddresspools">DescribeDnsGtmInstanceAddressPools</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>po**</p>
     */
    @NameInMap("AddrPoolId")
    public String addrPoolId;

    /**
     * <p>The number of consecutive health checks.</p>
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
     * <p>The list of monitoring nodes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IspCityNode")
    public java.util.List<AddDnsGtmMonitorRequestIspCityNode> ispCityNode;

    /**
     * <p>The language of the response. Default value: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The extended information. The parameters vary based on the protocol type.</p>
     * <ul>
     * <li><p>HTTP or HTTPS</p>
     * <ul>
     * <li><p>port: The health check port.</p>
     * </li>
     * <li><p>host: The Host header.</p>
     * </li>
     * <li><p>path: The URL path.</p>
     * </li>
     * <li><p>code: The health check is considered abnormal if the returned HTTP status code is greater than this value.</p>
     * </li>
     * <li><p>failureRate: The failure rate.</p>
     * </li>
     * <li><p>sni: Specifies whether to enable Server Name Indication (SNI). This parameter is used only when the health check protocol is HTTPS. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>nodeType: The type of the monitoring node. This parameter is used when the address pool type is DOMAIN. Valid values:</p>
     * <ul>
     * <li><p>IPV4</p>
     * </li>
     * <li><p>IPV6</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li><p>PING</p>
     * <ul>
     * <li><p>failureRate: The failure rate.</p>
     * </li>
     * <li><p>packetNum: The number of ping packets.</p>
     * </li>
     * <li><p>packetLossRate: The packet loss rate.</p>
     * </li>
     * <li><p>nodeType: The type of the monitoring node. This parameter is used when the address pool type is DOMAIN. Valid values:</p>
     * <ul>
     * <li><p>IPV4</p>
     * </li>
     * <li><p>IPV6</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li><p>TCP</p>
     * <ul>
     * <li><p>port: The health check port.</p>
     * </li>
     * <li><p>failureRate: The failure rate.</p>
     * </li>
     * <li><p>nodeType: The type of the monitoring node. This parameter is used when the address pool type is DOMAIN. Valid values:</p>
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
     * <blockquote>
     * <p>This parameter must be a JSON string.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;failureRate&quot;:50,&quot;port&quot;:80}</p>
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
     * <p>TCP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The timeout period. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
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
         * <p>The city code of the monitoring node.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>The carrier code of the monitoring node.</p>
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
