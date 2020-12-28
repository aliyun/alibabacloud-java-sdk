// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class EnableHotParamRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public EnableHotParamRuleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static EnableHotParamRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableHotParamRuleResponseBody self = new EnableHotParamRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableHotParamRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableHotParamRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableHotParamRuleResponseBody setData(EnableHotParamRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnableHotParamRuleResponseBodyData getData() {
        return this.data;
    }

    public EnableHotParamRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableHotParamRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnableHotParamRuleResponseBodyDataParamFlowItemList extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemType")
        public String itemType;

        @NameInMap("Threshold")
        public Float threshold;

        public static EnableHotParamRuleResponseBodyDataParamFlowItemList build(java.util.Map<String, ?> map) throws Exception {
            EnableHotParamRuleResponseBodyDataParamFlowItemList self = new EnableHotParamRuleResponseBodyDataParamFlowItemList();
            return TeaModel.build(map, self);
        }

        public EnableHotParamRuleResponseBodyDataParamFlowItemList setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public EnableHotParamRuleResponseBodyDataParamFlowItemList setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public EnableHotParamRuleResponseBodyDataParamFlowItemList setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class EnableHotParamRuleResponseBodyData extends TeaModel {
        @NameInMap("ParamIdx")
        public Integer paramIdx;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ParamFlowItemList")
        public java.util.List<EnableHotParamRuleResponseBodyDataParamFlowItemList> paramFlowItemList;

        @NameInMap("StatDurationSec")
        public Long statDurationSec;

        @NameInMap("BurstCount")
        public Integer burstCount;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("MaxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        @NameInMap("ControlBehavior")
        public Integer controlBehavior;

        @NameInMap("MetricType")
        public Integer metricType;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("Enable")
        public Boolean enable;

        public static EnableHotParamRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnableHotParamRuleResponseBodyData self = new EnableHotParamRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnableHotParamRuleResponseBodyData setParamIdx(Integer paramIdx) {
            this.paramIdx = paramIdx;
            return this;
        }
        public Integer getParamIdx() {
            return this.paramIdx;
        }

        public EnableHotParamRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public EnableHotParamRuleResponseBodyData setParamFlowItemList(java.util.List<EnableHotParamRuleResponseBodyDataParamFlowItemList> paramFlowItemList) {
            this.paramFlowItemList = paramFlowItemList;
            return this;
        }
        public java.util.List<EnableHotParamRuleResponseBodyDataParamFlowItemList> getParamFlowItemList() {
            return this.paramFlowItemList;
        }

        public EnableHotParamRuleResponseBodyData setStatDurationSec(Long statDurationSec) {
            this.statDurationSec = statDurationSec;
            return this;
        }
        public Long getStatDurationSec() {
            return this.statDurationSec;
        }

        public EnableHotParamRuleResponseBodyData setBurstCount(Integer burstCount) {
            this.burstCount = burstCount;
            return this;
        }
        public Integer getBurstCount() {
            return this.burstCount;
        }

        public EnableHotParamRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public EnableHotParamRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public EnableHotParamRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public EnableHotParamRuleResponseBodyData setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public EnableHotParamRuleResponseBodyData setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public EnableHotParamRuleResponseBodyData setMetricType(Integer metricType) {
            this.metricType = metricType;
            return this;
        }
        public Integer getMetricType() {
            return this.metricType;
        }

        public EnableHotParamRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public EnableHotParamRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
