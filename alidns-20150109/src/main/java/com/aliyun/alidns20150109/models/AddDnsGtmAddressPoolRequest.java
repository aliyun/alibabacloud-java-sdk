// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmAddressPoolRequest extends TeaModel {
    @NameInMap("Addr")
    public java.util.List<AddDnsGtmAddressPoolRequestAddr> addr;

    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("IspCityNode")
    public java.util.List<AddDnsGtmAddressPoolRequestIspCityNode> ispCityNode;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("LbaStrategy")
    public String lbaStrategy;

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
        @NameInMap("Addr")
        public String addr;

        @NameInMap("AttributeInfo")
        public String attributeInfo;

        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        @NameInMap("Mode")
        public String mode;

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
        @NameInMap("CityCode")
        public String cityCode;

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
