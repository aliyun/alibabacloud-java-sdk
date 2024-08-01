// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAddressPoolRequest extends TeaModel {
    /**
     * <p>The address pools.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Addr")
    public java.util.List<AddGtmAddressPoolRequestAddr> addr;

    /**
     * <p>The number of consecutive failures.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The ID of the GTM instance for which you want to create an address pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-xxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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
     */
    @NameInMap("IspCityNode")
    public java.util.List<AddGtmAddressPoolRequestIspCityNode> ispCityNode;

    /**
     * <p>The language of the values of specific response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The minimum number of available addresses in the address pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinAvailableAddrNum")
    public Integer minAvailableAddrNum;

    /**
     * <p>The extended information. The required parameters vary based on the value of ProtocolType.</p>
     * <p>When ProtocolType is set to HTTP or HTTPS:</p>
     * <ul>
     * <li>port: the port that you want to check</li>
     * <li>failureRate: the failure rate</li>
     * <li>code: the return code. The health check result is deemed abnormal if the returned value is greater than the specified value. Valid values: 400 and 500.</li>
     * <li>host: the host settings</li>
     * <li>path: the URL path</li>
     * </ul>
     * <p>When ProtocolType is set to PING:</p>
     * <ul>
     * <li>packetNum: the number of ping packets</li>
     * <li>packetLossRate: the packet loss rate</li>
     * <li>failureRate: the failure rate</li>
     * </ul>
     * <p>When ProtocolType is set to TCP:</p>
     * <ul>
     * <li>port: the port that you want to check</li>
     * <li>failureRate: the failure rate</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;host&quot;:&quot;aliyun.com&quot;,&quot;port&quot;:80}</p>
     */
    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    /**
     * <p>Specifies whether to enable the health check. Valid values:</p>
     * <ul>
     * <li><strong>OPEN</strong>: enables the health check.</li>
     * <li><strong>CLOSE</strong>: disables the health check. This is the default value.</li>
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
     * <p>Alibaba Cloud cluster</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The health check protocol. Valid values:</p>
     * <ul>
     * <li>HTTP</li>
     * <li>HTTPS</li>
     * <li>Ping</li>
     * <li>TCP</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTPS</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The timeout period. Unit: milliseconds. Valid values: 2000, 3000, 5000, and 10000.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The type of the address pool. Valid values:</p>
     * <ul>
     * <li><strong>IP</strong>: IPv4 address</li>
     * <li><strong>DOMAIN</strong>: domain name</li>
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
         * <p>The weight of the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        /**
         * <p>The mode of the address pool. Valid values:</p>
         * <ul>
         * <li><strong>SMART</strong>: smart return</li>
         * <li><strong>ONLINE</strong>: always online</li>
         * <li><strong>OFFLINE</strong>: always offline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SMART</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The address in the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
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
         * <p>The code of the city where the monitored node is deployed. For more information about specific values, see the response parameters of DescribeGtmMonitorAvailableConfig.</p>
         * 
         * <strong>example:</strong>
         * <p>546</p>
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
