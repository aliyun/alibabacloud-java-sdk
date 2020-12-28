// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CreateHotParamRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateHotParamRuleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static CreateHotParamRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHotParamRuleResponseBody self = new CreateHotParamRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHotParamRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateHotParamRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHotParamRuleResponseBody setData(CreateHotParamRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateHotParamRuleResponseBodyData getData() {
        return this.data;
    }

    public CreateHotParamRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateHotParamRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateHotParamRuleResponseBodyDataParamFlowItemList extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemType")
        public String itemType;

        @NameInMap("Threshold")
        public Float threshold;

        public static CreateHotParamRuleResponseBodyDataParamFlowItemList build(java.util.Map<String, ?> map) throws Exception {
            CreateHotParamRuleResponseBodyDataParamFlowItemList self = new CreateHotParamRuleResponseBodyDataParamFlowItemList();
            return TeaModel.build(map, self);
        }

        public CreateHotParamRuleResponseBodyDataParamFlowItemList setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public CreateHotParamRuleResponseBodyDataParamFlowItemList setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public CreateHotParamRuleResponseBodyDataParamFlowItemList setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class CreateHotParamRuleResponseBodyData extends TeaModel {
        @NameInMap("ParamIdx")
        public Integer paramIdx;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ParamFlowItemList")
        public java.util.List<CreateHotParamRuleResponseBodyDataParamFlowItemList> paramFlowItemList;

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

        public static CreateHotParamRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateHotParamRuleResponseBodyData self = new CreateHotParamRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateHotParamRuleResponseBodyData setParamIdx(Integer paramIdx) {
            this.paramIdx = paramIdx;
            return this;
        }
        public Integer getParamIdx() {
            return this.paramIdx;
        }

        public CreateHotParamRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateHotParamRuleResponseBodyData setParamFlowItemList(java.util.List<CreateHotParamRuleResponseBodyDataParamFlowItemList> paramFlowItemList) {
            this.paramFlowItemList = paramFlowItemList;
            return this;
        }
        public java.util.List<CreateHotParamRuleResponseBodyDataParamFlowItemList> getParamFlowItemList() {
            return this.paramFlowItemList;
        }

        public CreateHotParamRuleResponseBodyData setStatDurationSec(Long statDurationSec) {
            this.statDurationSec = statDurationSec;
            return this;
        }
        public Long getStatDurationSec() {
            return this.statDurationSec;
        }

        public CreateHotParamRuleResponseBodyData setBurstCount(Integer burstCount) {
            this.burstCount = burstCount;
            return this;
        }
        public Integer getBurstCount() {
            return this.burstCount;
        }

        public CreateHotParamRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public CreateHotParamRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public CreateHotParamRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateHotParamRuleResponseBodyData setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public CreateHotParamRuleResponseBodyData setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public CreateHotParamRuleResponseBodyData setMetricType(Integer metricType) {
            this.metricType = metricType;
            return this;
        }
        public Integer getMetricType() {
            return this.metricType;
        }

        public CreateHotParamRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public CreateHotParamRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
