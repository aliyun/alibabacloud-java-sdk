// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmMonitorRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("AddrPoolId")
    @Validation(required = true)
    public String addrPoolId;

    @NameInMap("ProtocolType")
    @Validation(required = true)
    public String protocolType;

    @NameInMap("Interval")
    @Validation(required = true)
    public Integer interval;

    @NameInMap("EvaluationCount")
    @Validation(required = true)
    public Integer evaluationCount;

    @NameInMap("Timeout")
    @Validation(required = true)
    public Integer timeout;

    @NameInMap("MonitorExtendInfo")
    @Validation(required = true)
    public String monitorExtendInfo;

    @NameInMap("IspCityNode")
    @Validation(required = true)
    public java.util.List<AddGtmMonitorRequestIspCityNode> ispCityNode;

    public static AddGtmMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGtmMonitorRequest self = new AddGtmMonitorRequest();
        return TeaModel.build(map, self);
    }

    public AddGtmMonitorRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddGtmMonitorRequest setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public AddGtmMonitorRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public AddGtmMonitorRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public AddGtmMonitorRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public AddGtmMonitorRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public AddGtmMonitorRequest setMonitorExtendInfo(String monitorExtendInfo) {
        this.monitorExtendInfo = monitorExtendInfo;
        return this;
    }
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    public AddGtmMonitorRequest setIspCityNode(java.util.List<AddGtmMonitorRequestIspCityNode> ispCityNode) {
        this.ispCityNode = ispCityNode;
        return this;
    }
    public java.util.List<AddGtmMonitorRequestIspCityNode> getIspCityNode() {
        return this.ispCityNode;
    }

    public static class AddGtmMonitorRequestIspCityNode extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

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
