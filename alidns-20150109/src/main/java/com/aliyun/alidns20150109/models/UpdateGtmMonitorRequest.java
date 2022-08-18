// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmMonitorRequest extends TeaModel {
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("IspCityNode")
    public java.util.List<UpdateGtmMonitorRequestIspCityNode> ispCityNode;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    @NameInMap("ProtocolType")
    public String protocolType;

    @NameInMap("Timeout")
    public Integer timeout;

    public static UpdateGtmMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmMonitorRequest self = new UpdateGtmMonitorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGtmMonitorRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public UpdateGtmMonitorRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public UpdateGtmMonitorRequest setIspCityNode(java.util.List<UpdateGtmMonitorRequestIspCityNode> ispCityNode) {
        this.ispCityNode = ispCityNode;
        return this;
    }
    public java.util.List<UpdateGtmMonitorRequestIspCityNode> getIspCityNode() {
        return this.ispCityNode;
    }

    public UpdateGtmMonitorRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateGtmMonitorRequest setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public UpdateGtmMonitorRequest setMonitorExtendInfo(String monitorExtendInfo) {
        this.monitorExtendInfo = monitorExtendInfo;
        return this;
    }
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    public UpdateGtmMonitorRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public UpdateGtmMonitorRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class UpdateGtmMonitorRequestIspCityNode extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("IspCode")
        public String ispCode;

        public static UpdateGtmMonitorRequestIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            UpdateGtmMonitorRequestIspCityNode self = new UpdateGtmMonitorRequestIspCityNode();
            return TeaModel.build(map, self);
        }

        public UpdateGtmMonitorRequestIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public UpdateGtmMonitorRequestIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

    }

}
