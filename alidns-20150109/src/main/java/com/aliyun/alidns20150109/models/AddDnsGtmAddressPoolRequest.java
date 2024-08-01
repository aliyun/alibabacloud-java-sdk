// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmAddressPoolRequest extends TeaModel {
    /**
     * <p>The address pools.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Addr")
    public java.util.List<AddDnsGtmAddressPoolRequestAddr> addr;

    /**
     * <p>The number of consecutive failures.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The health check interval. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The nodes for monitoring.</p>
     */
    @NameInMap("IspCityNode")
    public java.util.List<AddDnsGtmAddressPoolRequestIspCityNode> ispCityNode;

    /**
     * <p>The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The load balancing policy of the address pool. Valid values:</p>
     * <ul>
     * <li>ALL_RR: returns all addresses.</li>
     * <li>RATIO: returns addresses by weight.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>all_rr</p>
     */
    @NameInMap("LbaStrategy")
    public String lbaStrategy;

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
     * <li><p>code: the response code. The health check result is deemed abnormal if the returned value is greater than the specified value. Values: 400, 500.</p>
     * </li>
     * <li><p>failureRate: the failure rate</p>
     * </li>
     * <li><p>sni: specifies whether to enable server name indication (SNI). This parameter is available only when ProtocolType is set to HTTPS. Valid values:</p>
     * <ul>
     * <li>true: enables SNI.</li>
     * <li>other: disables SNI.</li>
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
     * 
     * <strong>example:</strong>
     * <p>{\&quot;code\&quot;:200,\&quot;path\&quot;:\&quot;\\index.htm\&quot;,\&quot;host\&quot;:\&quot;aliyun.com\&quot;}</p>
     */
    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    /**
     * <p>Specifies whether to enable the health check feature. If you set this parameter to OPEN, the system verifies the health check configurations. If you set this parameter to CLOSE, the system discards the health check configurations. Default value: CLOSE. Valid values:</p>
     * <ul>
     * <li>OPEN: enables the health check feature.</li>
     * <li>CLOSE: disables the health check feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("MonitorStatus")
    public String monitorStatus;

    /**
     * <p>The name of the address pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The health check protocol. Valid values:</p>
     * <ul>
     * <li>HTTP</li>
     * <li>HTTPS</li>
     * <li>PING</li>
     * <li>TCP</li>
     * </ul>
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
     * <p>1</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The type of the address pool. Valid values:</p>
     * <ul>
     * <li>IPV4: IPv4 address</li>
     * <li>IPV6: IPv6 address</li>
     * <li>DOMAIN: domain name</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("Type")
    public String type;

    public static AddDnsGtmAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDnsGtmAddressPoolRequest self = new AddDnsGtmAddressPoolRequest();
        return TeaModel.build(map, self);
    }

    public AddDnsGtmAddressPoolRequest setAddr(java.util.List<AddDnsGtmAddressPoolRequestAddr> addr) {
        this.addr = addr;
        return this;
    }
    public java.util.List<AddDnsGtmAddressPoolRequestAddr> getAddr() {
        return this.addr;
    }

    public AddDnsGtmAddressPoolRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public AddDnsGtmAddressPoolRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDnsGtmAddressPoolRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public AddDnsGtmAddressPoolRequest setIspCityNode(java.util.List<AddDnsGtmAddressPoolRequestIspCityNode> ispCityNode) {
        this.ispCityNode = ispCityNode;
        return this;
    }
    public java.util.List<AddDnsGtmAddressPoolRequestIspCityNode> getIspCityNode() {
        return this.ispCityNode;
    }

    public AddDnsGtmAddressPoolRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddDnsGtmAddressPoolRequest setLbaStrategy(String lbaStrategy) {
        this.lbaStrategy = lbaStrategy;
        return this;
    }
    public String getLbaStrategy() {
        return this.lbaStrategy;
    }

    public AddDnsGtmAddressPoolRequest setMonitorExtendInfo(String monitorExtendInfo) {
        this.monitorExtendInfo = monitorExtendInfo;
        return this;
    }
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    public AddDnsGtmAddressPoolRequest setMonitorStatus(String monitorStatus) {
        this.monitorStatus = monitorStatus;
        return this;
    }
    public String getMonitorStatus() {
        return this.monitorStatus;
    }

    public AddDnsGtmAddressPoolRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddDnsGtmAddressPoolRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public AddDnsGtmAddressPoolRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public AddDnsGtmAddressPoolRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class AddDnsGtmAddressPoolRequestAddr extends TeaModel {
        /**
         * <p>The address in the address pool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Addr")
        public String addr;

        /**
         * <p>The information about the source region of the address. The value of this parameter is a JSON string. Valid values:</p>
         * <ul>
         * <li><p>lineCode: the line code of the source region for the address</p>
         * </li>
         * <li><p>lineCodeRectifyType: the rectification type of the line code. Default value: AUTO. Valid values:</p>
         * <ul>
         * <li>NO_NEED: no need for rectification</li>
         * <li>RECTIFIED: rectified</li>
         * <li>AUTO: automatic rectification</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AttributeInfo")
        public String attributeInfo;

        /**
         * <p>The weight of the address.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        /**
         * <p>The return mode of the addresses: Valid values:</p>
         * <ul>
         * <li>SMART: smart return</li>
         * <li>ONLINE: always online</li>
         * <li>OFFLINE: always offline</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The description of the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        public static AddDnsGtmAddressPoolRequestAddr build(java.util.Map<String, ?> map) throws Exception {
            AddDnsGtmAddressPoolRequestAddr self = new AddDnsGtmAddressPoolRequestAddr();
            return TeaModel.build(map, self);
        }

        public AddDnsGtmAddressPoolRequestAddr setAddr(String addr) {
            this.addr = addr;
            return this;
        }
        public String getAddr() {
            return this.addr;
        }

        public AddDnsGtmAddressPoolRequestAddr setAttributeInfo(String attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public String getAttributeInfo() {
            return this.attributeInfo;
        }

        public AddDnsGtmAddressPoolRequestAddr setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public AddDnsGtmAddressPoolRequestAddr setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public AddDnsGtmAddressPoolRequestAddr setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class AddDnsGtmAddressPoolRequestIspCityNode extends TeaModel {
        /**
         * <p>The city code.</p>
         * <p>Specify the parameter according to the value of CityCode returned by the DescribeGtmMonitorAvailableConfig operation.</p>
         * 
         * <strong>example:</strong>
         * <p>503</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <ul>
         * <li>The Internet service provider (ISP) node. Specify the parameter according to the value of IspCode returned by the DescribeGtmMonitorAvailableConfig operation.</li>
         * <li>If the returned value of GroupType for the DescribeGtmMonitorAvailableConfig operation is BGP or Overseas, IspCode is not required and is set to 465 by default.</li>
         * <li>If the returned value of GroupType for the DescribeGtmMonitorAvailableConfig operation is not BGP or Overseas, IspCode is required. When IspCode is specified, CityCode is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>465</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        public static AddDnsGtmAddressPoolRequestIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            AddDnsGtmAddressPoolRequestIspCityNode self = new AddDnsGtmAddressPoolRequestIspCityNode();
            return TeaModel.build(map, self);
        }

        public AddDnsGtmAddressPoolRequestIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public AddDnsGtmAddressPoolRequestIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

    }

}
