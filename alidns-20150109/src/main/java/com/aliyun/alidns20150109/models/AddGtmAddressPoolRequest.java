// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAddressPoolRequest extends TeaModel {
    /**
     * <p>The list of addresses in the address pool.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Addr")
    public java.util.List<AddGtmAddressPoolRequestAddr> addr;

    /**
     * <p>The number of consecutive failed health checks.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-xxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The health check interval. Unit: seconds. The value must be 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The list of city nodes for monitoring.</p>
     */
    @NameInMap("IspCityNode")
    public java.util.List<AddGtmAddressPoolRequestIspCityNode> ispCityNode;

    /**
     * <p>The response language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The minimum number of available addresses.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinAvailableAddrNum")
    public Integer minAvailableAddrNum;

    /**
     * <p>The extended information. The parameters that you must configure vary based on the health check protocol.</p>
     * <p>HTTP and HTTPS:</p>
     * <ul>
     * <li><p>port: The health check port.</p>
     * </li>
     * <li><p>failureRate: The failure rate.</p>
     * </li>
     * <li><p>code: The return code. A response with a return code greater than the specified value is considered abnormal. Valid values: 400 and 500.</p>
     * </li>
     * <li><p>host: The host setting.</p>
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
     * 
     * <strong>example:</strong>
     * <p>{&quot;host&quot;:&quot;aliyun.com&quot;,&quot;port&quot;:80}</p>
     */
    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    /**
     * <p>The status of the health check. Valid values:</p>
     * <ul>
     * <li><p><strong>OPEN</strong>: enabled</p>
     * </li>
     * <li><p><strong>CLOSE</strong> (default): disabled</p>
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
     * <p>测试</p>
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
     * <li><p>Ping</p>
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
     * <p>The timeout period. Unit: milliseconds. Valid values: 2000, 3000, 5000, and 10000.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The type of the address pool. Valid values:</p>
     * <ul>
     * <li><p><strong>IP</strong>: IPv4 address</p>
     * </li>
     * <li><p><strong>DOMAIN</strong>: domain name</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IP</p>
     */
    @NameInMap("Type")
    public String type;

    public static AddGtmAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGtmAddressPoolRequest self = new AddGtmAddressPoolRequest();
        return TeaModel.build(map, self);
    }

    public AddGtmAddressPoolRequest setAddr(java.util.List<AddGtmAddressPoolRequestAddr> addr) {
        this.addr = addr;
        return this;
    }
    public java.util.List<AddGtmAddressPoolRequestAddr> getAddr() {
        return this.addr;
    }

    public AddGtmAddressPoolRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public AddGtmAddressPoolRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddGtmAddressPoolRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public AddGtmAddressPoolRequest setIspCityNode(java.util.List<AddGtmAddressPoolRequestIspCityNode> ispCityNode) {
        this.ispCityNode = ispCityNode;
        return this;
    }
    public java.util.List<AddGtmAddressPoolRequestIspCityNode> getIspCityNode() {
        return this.ispCityNode;
    }

    public AddGtmAddressPoolRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddGtmAddressPoolRequest setMinAvailableAddrNum(Integer minAvailableAddrNum) {
        this.minAvailableAddrNum = minAvailableAddrNum;
        return this;
    }
    public Integer getMinAvailableAddrNum() {
        return this.minAvailableAddrNum;
    }

    public AddGtmAddressPoolRequest setMonitorExtendInfo(String monitorExtendInfo) {
        this.monitorExtendInfo = monitorExtendInfo;
        return this;
    }
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    public AddGtmAddressPoolRequest setMonitorStatus(String monitorStatus) {
        this.monitorStatus = monitorStatus;
        return this;
    }
    public String getMonitorStatus() {
        return this.monitorStatus;
    }

    public AddGtmAddressPoolRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddGtmAddressPoolRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public AddGtmAddressPoolRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public AddGtmAddressPoolRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class AddGtmAddressPoolRequestAddr extends TeaModel {
        /**
         * <p>The weight of the address.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        /**
         * <p>The mode of the address. Valid values:</p>
         * <ul>
         * <li><p><strong>SMART</strong>: smart return</p>
         * </li>
         * <li><p><strong>ONLINE</strong>: always online</p>
         * </li>
         * <li><p><strong>OFFLINE</strong>: always offline</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SMART</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.XX.XX</p>
         */
        @NameInMap("Value")
        public String value;

        public static AddGtmAddressPoolRequestAddr build(java.util.Map<String, ?> map) throws Exception {
            AddGtmAddressPoolRequestAddr self = new AddGtmAddressPoolRequestAddr();
            return TeaModel.build(map, self);
        }

        public AddGtmAddressPoolRequestAddr setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public AddGtmAddressPoolRequestAddr setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public AddGtmAddressPoolRequestAddr setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class AddGtmAddressPoolRequestIspCityNode extends TeaModel {
        /**
         * <p>The city code of the monitoring node. For information about valid values, see the response of DescribeGtmMonitorAvailableConfig.</p>
         * 
         * <strong>example:</strong>
         * <p>546</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <ul>
         * <li><p>For information about valid values, see the response of DescribeGtmMonitorAvailableConfig.</p>
         * </li>
         * <li><p>If GroupType is set to Border Gateway Protocol (BGP) or Overseas, IspCityNode.N.IspCode is optional. The default value is 465.</p>
         * </li>
         * <li><p>If GroupType is not set to BGP or Overseas, IspCityNode.N.IspCode is required and must be used with IspCityNode.N.CityCode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>465</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        public static AddGtmAddressPoolRequestIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            AddGtmAddressPoolRequestIspCityNode self = new AddGtmAddressPoolRequestIspCityNode();
            return TeaModel.build(map, self);
        }

        public AddGtmAddressPoolRequestIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public AddGtmAddressPoolRequestIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

    }

}
