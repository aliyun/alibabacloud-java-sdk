// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmAddressPoolRequest extends TeaModel {
    /**
     * <p>The list of addresses in the address pool.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Addr")
    public java.util.List<AddDnsGtmAddressPoolRequestAddr> addr;

    /**
     * <p>The number of consecutive failed health checks.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The instance ID.
     * &lt;props=&quot;intl&quot;&gt;Call <a href="https://www.alibabacloud.com/help/en/dns/api-alidns-2015-01-09-describednsgtminstances">DescribeDnsGtmInstances</a> to obtain the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-cs02xyk****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The health check interval. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The list of health check nodes. If MonitorStatus is set to OPEN, you must specify at least one valid health check node.</p>
     */
    @NameInMap("IspCityNode")
    public java.util.List<AddDnsGtmAddressPoolRequestIspCityNode> ispCityNode;

    /**
     * <p>The language of some returned parameters. Default value: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The load balancing policy. Valid values:</p>
     * <ul>
     * <li><p>ALL_RR: returns all addresses.</p>
     * </li>
     * <li><p>RATIO: returns addresses by weight.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL_RR</p>
     */
    @NameInMap("LbaStrategy")
    public String lbaStrategy;

    /**
     * <p>The extended information. This parameter is a JSON string. The required parameters vary based on the health check protocol:</p>
     * <ul>
     * <li><p>HTTP and HTTPS:</p>
     * <ul>
     * <li><p>port: The health check port.</p>
     * </li>
     * <li><p>host: The host settings.</p>
     * </li>
     * <li><p>path: The URL path.</p>
     * </li>
     * <li><p>code: The return code. A response with a status code greater than this value is considered abnormal. Valid values: 400 and 500.</p>
     * </li>
     * <li><p>failureRate: The failure rate.</p>
     * </li>
     * <li><p>sni: Specifies whether to enable Server Name Indication (SNI). This parameter is available only for the HTTPS protocol.</p>
     * <ul>
     * <li><p>true: Enable SNI.</p>
     * </li>
     * <li><p>Other values: Disable SNI.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>nodeType: The type of the health check node when the address pool type is DOMAIN. Valid values:</p>
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
     * <li><p>nodeType: The type of the health check node when the address pool type is DOMAIN. Valid values:</p>
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
     * <li><p>port: The health check port.</p>
     * </li>
     * <li><p>failureRate: The failure rate.</p>
     * </li>
     * <li><p>nodeType: The type of the health check node when the address pool type is DOMAIN. Valid values:</p>
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
     * 
     * <strong>example:</strong>
     * <p>{&quot;failureRate&quot;:50,&quot;port&quot;:80}</p>
     */
    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    /**
     * <p>The status of the health check feature. Default value: CLOSE. If you set this parameter to OPEN, the health check configuration is verified. Otherwise, the configuration is ignored.</p>
     * <ul>
     * <li><p>OPEN: enabled</p>
     * </li>
     * <li><p>CLOSE: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OPEN</p>
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
     * <li><p>HTTP</p>
     * </li>
     * <li><p>HTTPS</p>
     * </li>
     * <li><p>PING</p>
     * </li>
     * <li><p>TCP</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The timeout period. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The type of the address pool. Valid values:</p>
     * <ul>
     * <li><p>IPV4: IPv4 address</p>
     * </li>
     * <li><p>IPV6: IPv6 address</p>
     * </li>
     * <li><p>DOMAIN: domain name</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IPV4</p>
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
         * <p>The address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>223.5.XX.XX</p>
         */
        @NameInMap("Addr")
        public String addr;

        /**
         * <p>The source region of the address. This parameter is a JSON string.</p>
         * <ul>
         * <li><p>lineCode: The line code of the source region.</p>
         * </li>
         * <li><p>lineCodeRectifyType: The rectification type for the line code. Default value: AUTO.</p>
         * <ul>
         * <li><p>NO_NEED: No rectification is performed.</p>
         * </li>
         * <li><p>RECTIFIED: The line code is rectified.</p>
         * </li>
         * <li><p>AUTO: The line code is automatically rectified.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;lineCodeRectifyType&quot;:&quot;AUTO&quot;, &quot;lineCode&quot;:[]}</p>
         */
        @NameInMap("AttributeInfo")
        public String attributeInfo;

        /**
         * <p>The weight.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        /**
         * <p>The mode. Valid values:</p>
         * <ul>
         * <li><p>SMART: smart return</p>
         * </li>
         * <li><p>ONLINE: always online</p>
         * </li>
         * <li><p>OFFLINE: always offline</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SMART</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The remarks.</p>
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
         * <p>The city code. If MonitorStatus is set to OPEN, CityCode is required.</p>
         * <p>For information about the valid values, see the response of the DescribeDnsGtmMonitorAvailableConfig operation.</p>
         * 
         * <strong>example:</strong>
         * <p>503</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>If MonitorStatus is set to OPEN, IspCode is required.
         * For information about the valid values, see the response of the DescribeDnsGtmMonitorAvailableConfig operation.</p>
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
