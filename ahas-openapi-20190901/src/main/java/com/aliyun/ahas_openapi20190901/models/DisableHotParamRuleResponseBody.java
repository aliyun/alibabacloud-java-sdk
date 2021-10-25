// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DisableHotParamRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public DisableHotParamRuleResponseBodyData data;

    public static DisableHotParamRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableHotParamRuleResponseBody self = new DisableHotParamRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableHotParamRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisableHotParamRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableHotParamRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableHotParamRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DisableHotParamRuleResponseBody setData(DisableHotParamRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DisableHotParamRuleResponseBodyData getData() {
        return this.data;
    }

    public static class DisableHotParamRuleResponseBodyDataParamFlowItemList extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("ItemType")
        public String itemType;

        public static DisableHotParamRuleResponseBodyDataParamFlowItemList build(java.util.Map<String, ?> map) throws Exception {
            DisableHotParamRuleResponseBodyDataParamFlowItemList self = new DisableHotParamRuleResponseBodyDataParamFlowItemList();
            return TeaModel.build(map, self);
        }

        public DisableHotParamRuleResponseBodyDataParamFlowItemList setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public DisableHotParamRuleResponseBodyDataParamFlowItemList setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public DisableHotParamRuleResponseBodyDataParamFlowItemList setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

    }

    public static class DisableHotParamRuleResponseBodyData extends TeaModel {
        @NameInMap("ParamIdx")
        public Integer paramIdx;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("StatDurationSec")
        public Long statDurationSec;

        @NameInMap("BurstCount")
        public Integer burstCount;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("ControlBehavior")
        public Integer controlBehavior;

        @NameInMap("MaxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        @NameInMap("MetricType")
        public Integer metricType;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("ParamFlowItemList")
        public java.util.List<DisableHotParamRuleResponseBodyDataParamFlowItemList> paramFlowItemList;

        public static DisableHotParamRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DisableHotParamRuleResponseBodyData self = new DisableHotParamRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DisableHotParamRuleResponseBodyData setParamIdx(Integer paramIdx) {
            this.paramIdx = paramIdx;
            return this;
        }
        public Integer getParamIdx() {
            return this.paramIdx;
        }

        public DisableHotParamRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DisableHotParamRuleResponseBodyData setStatDurationSec(Long statDurationSec) {
            this.statDurationSec = statDurationSec;
            return this;
        }
        public Long getStatDurationSec() {
            return this.statDurationSec;
        }

        public DisableHotParamRuleResponseBodyData setBurstCount(Integer burstCount) {
            this.burstCount = burstCount;
            return this;
        }
        public Integer getBurstCount() {
            return this.burstCount;
        }

        public DisableHotParamRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DisableHotParamRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DisableHotParamRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DisableHotParamRuleResponseBodyData setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public DisableHotParamRuleResponseBodyData setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public DisableHotParamRuleResponseBodyData setMetricType(Integer metricType) {
            this.metricType = metricType;
            return this;
        }
        public Integer getMetricType() {
            return this.metricType;
        }

        public DisableHotParamRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public DisableHotParamRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DisableHotParamRuleResponseBodyData setParamFlowItemList(java.util.List<DisableHotParamRuleResponseBodyDataParamFlowItemList> paramFlowItemList) {
            this.paramFlowItemList = paramFlowItemList;
            return this;
        }
        public java.util.List<DisableHotParamRuleResponseBodyDataParamFlowItemList> getParamFlowItemList() {
            return this.paramFlowItemList;
        }

    }

}
