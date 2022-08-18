// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAddressPoolRequest extends TeaModel {
    @NameInMap("Addr")
    public java.util.List<AddGtmAddressPoolRequestAddr> addr;

    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("IspCityNode")
    public java.util.List<AddGtmAddressPoolRequestIspCityNode> ispCityNode;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MinAvailableAddrNum")
    public Integer minAvailableAddrNum;

    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    @NameInMap("MonitorStatus")
    public String monitorStatus;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProtocolType")
    public String protocolType;

    @NameInMap("Timeout")
    public Integer timeout;

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
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        @NameInMap("Mode")
        public String mode;

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
        @NameInMap("CityCode")
        public String cityCode;

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
