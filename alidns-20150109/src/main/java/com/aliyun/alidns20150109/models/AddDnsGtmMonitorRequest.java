// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmMonitorRequest extends TeaModel {
    @NameInMap("AddrPoolId")
    public String addrPoolId;

    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("IspCityNode")
    public java.util.List<AddDnsGtmMonitorRequestIspCityNode> ispCityNode;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    @NameInMap("ProtocolType")
    public String protocolType;

    @NameInMap("Timeout")
    public Integer timeout;

    public static AddDnsGtmMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDnsGtmMonitorRequest self = new AddDnsGtmMonitorRequest();
        return TeaModel.build(map, self);
    }

    public AddDnsGtmMonitorRequest setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public AddDnsGtmMonitorRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public AddDnsGtmMonitorRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public AddDnsGtmMonitorRequest setIspCityNode(java.util.List<AddDnsGtmMonitorRequestIspCityNode> ispCityNode) {
        this.ispCityNode = ispCityNode;
        return this;
    }
    public java.util.List<AddDnsGtmMonitorRequestIspCityNode> getIspCityNode() {
        return this.ispCityNode;
    }

    public AddDnsGtmMonitorRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddDnsGtmMonitorRequest setMonitorExtendInfo(String monitorExtendInfo) {
        this.monitorExtendInfo = monitorExtendInfo;
        return this;
    }
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    public AddDnsGtmMonitorRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public AddDnsGtmMonitorRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class AddDnsGtmMonitorRequestIspCityNode extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("IspCode")
        public String ispCode;

        public static AddDnsGtmMonitorRequestIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            AddDnsGtmMonitorRequestIspCityNode self = new AddDnsGtmMonitorRequestIspCityNode();
            return TeaModel.build(map, self);
        }

        public AddDnsGtmMonitorRequestIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public AddDnsGtmMonitorRequestIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

    }

}
