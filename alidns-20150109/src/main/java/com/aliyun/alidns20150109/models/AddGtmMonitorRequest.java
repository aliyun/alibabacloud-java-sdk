// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmMonitorRequest extends TeaModel {
    /**
     * <p>The ID of the address pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("AddrPoolId")
    public String addrPoolId;

    /**
     * <p>The number of consecutive failed health checks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The health check interval. Unit: seconds. The value must be 60.</p>
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
    public java.util.List<AddGtmMonitorRequestIspCityNode> ispCityNode;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The extended information. You must pass parameters based on the value of ProtocolType:</p>
     * <p>For HTTP and HTTPS:</p>
     * <ul>
     * <li><p>port: The health check port.</p>
     * </li>
     * <li><p>failureRate: The failure rate.</p>
     * </li>
     * <li><p>code: The return code. A response with a status code greater than this value is considered abnormal. Valid values: 400 and 500.</p>
     * </li>
     * <li><p>host: The host settings.</p>
     * </li>
     * <li><p>path: The URL path.</p>
     * </li>
     * </ul>
     * <p>For PING:</p>
     * <ul>
     * <li><p>packetNum: The number of ping packets.</p>
     * </li>
     * <li><p>packetLossRate: The packet loss rate.</p>
     * </li>
     * <li><p>failureRate: The failure rate.</p>
     * </li>
     * </ul>
     * <p>For TCP:</p>
     * <ul>
     * <li><p>port: The health check port.</p>
     * </li>
     * <li><p>failureRate: The failure rate.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;code\&quot;:200,\&quot;path\&quot;:\&quot;/index.htm\&quot;,\&quot;host\&quot;:\&quot;aliyun.com\&quot;}</p>
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
     * <p>HTTP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The timeout period. Unit: milliseconds. Valid values: 2000, 3000, 5000, and 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static AddGtmMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGtmMonitorRequest self = new AddGtmMonitorRequest();
        return TeaModel.build(map, self);
    }

    public AddGtmMonitorRequest setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public AddGtmMonitorRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public AddGtmMonitorRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public AddGtmMonitorRequest setIspCityNode(java.util.List<AddGtmMonitorRequestIspCityNode> ispCityNode) {
        this.ispCityNode = ispCityNode;
        return this;
    }
    public java.util.List<AddGtmMonitorRequestIspCityNode> getIspCityNode() {
        return this.ispCityNode;
    }

    public AddGtmMonitorRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddGtmMonitorRequest setMonitorExtendInfo(String monitorExtendInfo) {
        this.monitorExtendInfo = monitorExtendInfo;
        return this;
    }
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    public AddGtmMonitorRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public AddGtmMonitorRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class AddGtmMonitorRequestIspCityNode extends TeaModel {
        /**
         * <p>The city code.</p>
         * <p>For more information about the valid values, see the response of the DescribeGtmMonitorAvailableConfig operation.</p>
         * 
         * <strong>example:</strong>
         * <p>503</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>For more information about the valid values, see the response of the DescribeGtmMonitorAvailableConfig operation.</p>
         * <ul>
         * <li><p>If GroupType is set to Border Gateway Protocol (BGP) or Overseas, you do not need to specify IspCityNode.N.IspCode. The default value is 465.</p>
         * </li>
         * <li><p>If GroupType is not set to BGP or Overseas, you must specify IspCityNode.N.IspCode. The value of IspCityNode.N.IspCode must be consistent with the value of IspCityNode.N.CityCode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>465</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        public static AddGtmMonitorRequestIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            AddGtmMonitorRequestIspCityNode self = new AddGtmMonitorRequestIspCityNode();
            return TeaModel.build(map, self);
        }

        public AddGtmMonitorRequestIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public AddGtmMonitorRequestIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

    }

}
