// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmAddressPoolRequest extends TeaModel {
    /**
     * <p>The addresses in the address pool.</p>
     */
    @NameInMap("Addr")
    public java.util.List<AddDnsGtmAddressPoolRequestAddr> addr;

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
     * <p>The health check interval. Unit: seconds.</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The monitored nodes.</p>
     */
    @NameInMap("IspCityNode")
    public java.util.List<AddDnsGtmAddressPoolRequestIspCityNode> ispCityNode;

    /**
     * <p>The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The load balancing policy for the address pool. Valid values:</p>
     * <br>
     * <p>*   ALL_RR: returns all addresses.</p>
     * <p>*   RATIO: returns addresses by weight.</p>
     */
    @NameInMap("LbaStrategy")
    public String lbaStrategy;

    /**
     * <p>The extended information, that is, the parameters required for the protocol. Different protocols require different parameters:</p>
     * <br>
     * <p>*   HTTP or HTTPS:</p>
     * <br>
     * <p>    *   port: the port to check.</p>
     * <br>
     * <p>    *   host: the host configuration.</p>
     * <br>
     * <p>    *   path: the health check URL.</p>
     * <br>
     * <p>    *   code: the status code threshold. If the returned status code is greater than the specified threshold, the application service is deemed abnormal.</p>
     * <br>
     * <p>    *   failureRate: the failure rate.</p>
     * <br>
     * <p>    *   sni: specifies whether to enable Server Name Indication (SNI). This parameter is only required for the HTTPS protocol. Valid values:</p>
     * <br>
     * <p>        *   true: enables SNI.</p>
     * <p>        *   Other value: disables SNI.</p>
     * <br>
     * <p>    *   nodeType: the type of the monitored node when the address pool type is DOMAIN. Valid values:</p>
     * <br>
     * <p>        *   IPV4</p>
     * <p>        *   IPV6</p>
     * <br>
     * <p>*   PING:</p>
     * <br>
     * <p>    *   failureRate: the failure rate.</p>
     * <br>
     * <p>    *   packetNum: the number of ping packets.</p>
     * <br>
     * <p>    *   packetLossRate: the loss rate of ping packets.</p>
     * <br>
     * <p>    *   nodeType: the type of the monitored node when the address pool type is DOMAIN. Valid values:</p>
     * <br>
     * <p>        *   IPV4</p>
     * <p>        *   IPV6</p>
     * <br>
     * <p>*   TCP:</p>
     * <br>
     * <p>    *   port: the port to check.</p>
     * <br>
     * <p>    *   failureRate: the failure rate.</p>
     * <br>
     * <p>    *   nodeType: the type of the monitored node when the address pool type is DOMAIN. Valid values:</p>
     * <br>
     * <p>        *   IPV4</p>
     * <p>        *   IPV6</p>
     */
    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    /**
     * <p>Specifies whether to enable the health check. If this parameter is set to OPEN, the system validates the health check configuration. If this parameter is set to CLOSE, the health check configuration is discarded. Default value: CLOSE. Valid values:</p>
     * <br>
     * <p>*   OPEN: enables the health check.</p>
     * <p>*   CLOSE: disables the health check.</p>
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
     * <p>The health check timeout period. Unit: milliseconds.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The type of the address pool. Valid values:</p>
     * <br>
     * <p>*   IPV4: IPv4 address</p>
     * <p>*   IPV6: IPv6 address</p>
     * <p>*   DOMAIN: domain name</p>
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
         */
        @NameInMap("Addr")
        public String addr;

        /**
         * <p>The source region of the address. The value is a JSON string.</p>
         * <br>
         * <p>*   lineCode: the line code of the source region of the address.</p>
         * <br>
         * <p>*   lineCodeRectifyType: the rectification type of the line code. Default value: AUTO. Valid values:</p>
         * <br>
         * <p>    *   NO_NEED: no need for rectification</p>
         * <p>    *   RECTIFIED: rectified</p>
         * <p>    *   AUTO: automatic rectification</p>
         */
        @NameInMap("AttributeInfo")
        public String attributeInfo;

        /**
         * <p>The weight of the address.</p>
         */
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        /**
         * <p>The mode of the address. Valid values:</p>
         * <br>
         * <p>*   SMART: smart return</p>
         * <p>*   ONLINE: always online</p>
         * <p>*   OFFLINE: always offline</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The description of the address.</p>
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
         * <p>The code of the city where the monitored node is deployed.</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>The code of the Internet service provider (ISP) to which the monitored node belongs.</p>
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
