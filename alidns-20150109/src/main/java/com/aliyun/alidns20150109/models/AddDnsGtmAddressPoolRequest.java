// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmAddressPoolRequest extends TeaModel {
    /**
     * <p>The address pools.</p>
     */
    @NameInMap("Addr")
    public java.util.List<AddDnsGtmAddressPoolRequestAddr> addr;

    /**
     * <p>The number of consecutive health check failures.</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The health check interval. Unit: seconds.</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The city nodes to monitor.</p>
     */
    @NameInMap("IspCityNode")
    public java.util.List<AddDnsGtmAddressPoolRequestIspCityNode> ispCityNode;

    /**
     * <p>The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The load balancing policy of the address pool. Valid values:</p>
     * <br>
     * <p>*   ALL_RR: returns all addresses.</p>
     * <p>*   RATIO: returns addresses by weight.</p>
     */
    @NameInMap("LbaStrategy")
    public String lbaStrategy;

    /**
     * <p>The extended information. The required parameters vary based on the health check protocol.</p>
     * <br>
     * <p>*   HTTP or HTTPS:</p>
     * <br>
     * <p>    *   port: the check port.</p>
     * <br>
     * <p>    *   host: the host settings.</p>
     * <br>
     * <p>    *   path: the URL path.</p>
     * <br>
     * <p>    *   code: the return code greater than the specified value.</p>
     * <br>
     * <p>    *   failureRate: the failure rate.</p>
     * <br>
     * <p>    *   sni: specifies whether to enable server name indication (SNI). This parameter is available only when Health Check Protocol is set to HTTPS. Valid values:</p>
     * <br>
     * <p>        *   true: enables SNI.</p>
     * <p>        *   other: disables SNI.</p>
     * <br>
     * <p>    *   nodeType: The type of the node to monitor when the address pool type is DOMAIN. Valid values:</p>
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
     * <p>    *   nodeType: the type of the node to monitor when the address pool type is DOMAIN. Valid values:</p>
     * <br>
     * <p>        *   IPV4</p>
     * <p>        *   IPV6</p>
     * <br>
     * <p>*   TCP:</p>
     * <br>
     * <p>    *   port: the check port.</p>
     * <br>
     * <p>    *   failureRate: the failure rate.</p>
     * <br>
     * <p>    *   nodeType: the type of the node to monitor when the address pool type is DOMAIN. Valid values:</p>
     * <br>
     * <p>        *   IPV4</p>
     * <p>        *   IPV6</p>
     */
    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    /**
     * <p>Specifies whether to enable the health check feature. If you set this parameter to OPEN, the system verifies the health check configurations. If you set this parameter to CLOSE, the system discards the health check configurations. Default value: CLOSE. Valid values:</p>
     * <br>
     * <p>*   OPEN: enables the health check feature.</p>
     * <p>*   CLOSE: disables the health check feature.</p>
     */
    @NameInMap("MonitorStatus")
    public String monitorStatus;

    /**
     * <p>The name of the address pool.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The health check protocol. Valid values:</p>
     * <br>
     * <p>*   HTTP</p>
     * <p>*   HTTPS</p>
     * <p>*   PING</p>
     * <p>*   TCP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The period of health check timeout. Unit: milliseconds.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The type of the address pool. Valid values:</p>
     * <br>
     * <p>*   IPV4: IPv4 address.</p>
     * <p>*   IPV6: IPv6 address.</p>
     * <p>*   DOMAIN: domain name.</p>
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
         */
        @NameInMap("Addr")
        public String addr;

        /**
         * <p>The source region of the address, in JSON-formatted string.</p>
         * <br>
         * <p>*   LineCode: the line code of the source region of the address.</p>
         * <br>
         * <p>*   lineCodeRectifyType: the rectification type of the line code. Default value: AUTO. Valid values:</p>
         * <br>
         * <p>    *   NO_NEED: no need for rectification.</p>
         * <p>    *   RECTIFIED: rectified.</p>
         * <p>    *   AUTO: automatic rectification.</p>
         */
        @NameInMap("AttributeInfo")
        public String attributeInfo;

        /**
         * <p>The weight of the address.</p>
         */
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        /**
         * <p>The response mode of address resolution. Valid values:</p>
         * <br>
         * <p>*   SMART: smart return.</p>
         * <p>*   ONLINE: always online.</p>
         * <p>*   OFFLINE: always offline.</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The additional information about the address.</p>
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
         * <p>The code of the city node to monitor.</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>The code of the Internet service provider (ISP) node to monitor.</p>
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
