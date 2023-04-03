// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAddressPoolRequest extends TeaModel {
    /**
     * <p>The addresses in the address pool.</p>
     */
    @NameInMap("Addr")
    public java.util.List<AddGtmAddressPoolRequestAddr> addr;

    /**
     * <p>The maximum number of consecutive exceptions detected. If the number of consecutive exceptions detected reaches the maximum number, the application service is deemed abnormal.</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The ID of the GTM instance for which you want to create an address pool.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The health check interval. Unit: seconds. Set the value to 60.</p>
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
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The minimum number of available addresses in the address pool.</p>
     */
    @NameInMap("MinAvailableAddrNum")
    public Integer minAvailableAddrNum;

    /**
     * <p>The extended information, that is, the parameters required for the protocol. Different protocols require different parameters:</p>
     * <br>
     * <p>HTTP or HTTPS:</p>
     * <br>
     * <p>*   port: the port to check.</p>
     * <p>*   failureRate: the failure rate.</p>
     * <p>*   code: the status code threshold. If the returned status code is greater than the specified threshold, the application service is deemed abnormal. Valid values: 400 and 500.</p>
     * <p>*   host: the host configuration.</p>
     * <p>*   path: the health check URL.</p>
     * <br>
     * <p>PING:</p>
     * <br>
     * <p>*   packetNum: the number of ping packets.</p>
     * <p>*   packetLossRate: the loss rate of ping packets.</p>
     * <p>*   failureRate: the failure rate.</p>
     * <br>
     * <p>TCP:</p>
     * <br>
     * <p>*   port: the port to check.</p>
     * <p>*   failureRate: the failure rate.</p>
     */
    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    /**
     * <p>Specifies whether to enable the health check. Valid values:</p>
     * <br>
     * <p>*   **OPEN**: enables the health check.</p>
     * <p>*   **CLOSE**: disables the health check. This is the default value.</p>
     */
    @NameInMap("MonitorStatus")
    public String monitorStatus;

    /**
     * <p>The name of the address pool that you want to create.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The protocol used for the health check. Valid values:</p>
     * <br>
     * <p>*   HTTP</p>
     * <p>*   HTTPS</p>
     * <p>*   PING</p>
     * <p>*   TCP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The health check timeout period. Unit: milliseconds. Valid values: 2000, 3000, 5000, and 10000.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The type of the address pool. Valid values:</p>
     * <br>
     * <p>*   **IP**: IPv4 address</p>
     * <p>*   **DOMAIN**: domain name</p>
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
         */
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        /**
         * <p>The mode of the address. Valid values:</p>
         * <br>
         * <p>*   **SMART**: smart return</p>
         * <p>*   **ONLINE**: always online</p>
         * <p>*   **OFFLINE**: always offline</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The address.</p>
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
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>*   The code of the Internet service provider (ISP) to which the monitored node belongs. For more information about specific values, see the response parameters of DescribeGtmMonitorAvailableConfig.</p>
         * <p>*   If the value of the GroupType parameter is BGP or OVERSEAS, IspCode is optional. The default value is 465.</p>
         * <p>*   If the value of the GroupType parameter is not BGP or OVERSEAS, IspCode is required and is used together with CityCode.</p>
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
