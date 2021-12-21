// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CreateHotParamItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateHotParamItemsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateHotParamItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHotParamItemsResponseBody self = new CreateHotParamItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHotParamItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateHotParamItemsResponseBody setData(CreateHotParamItemsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateHotParamItemsResponseBodyData getData() {
        return this.data;
    }

    public CreateHotParamItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateHotParamItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHotParamItemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateHotParamItemsResponseBodyDataParamFlowItemList extends TeaModel {
        @NameInMap("ItemType")
        public String itemType;

        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("Threshold")
        public Float threshold;

        public static CreateHotParamItemsResponseBodyDataParamFlowItemList build(java.util.Map<String, ?> map) throws Exception {
            CreateHotParamItemsResponseBodyDataParamFlowItemList self = new CreateHotParamItemsResponseBodyDataParamFlowItemList();
            return TeaModel.build(map, self);
        }

        public CreateHotParamItemsResponseBodyDataParamFlowItemList setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public CreateHotParamItemsResponseBodyDataParamFlowItemList setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public CreateHotParamItemsResponseBodyDataParamFlowItemList setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class CreateHotParamItemsResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("BurstCount")
        public Integer burstCount;

        @NameInMap("ControlBehavior")
        public Integer controlBehavior;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("MaxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        @NameInMap("MetricType")
        public Integer metricType;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ParamFlowItemList")
        public java.util.List<CreateHotParamItemsResponseBodyDataParamFlowItemList> paramFlowItemList;

        @NameInMap("ParamIdx")
        public Integer paramIdx;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("StatDurationSec")
        public Long statDurationSec;

        @NameInMap("Threshold")
        public Float threshold;

        public static CreateHotParamItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateHotParamItemsResponseBodyData self = new CreateHotParamItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateHotParamItemsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateHotParamItemsResponseBodyData setBurstCount(Integer burstCount) {
            this.burstCount = burstCount;
            return this;
        }
        public Integer getBurstCount() {
            return this.burstCount;
        }

        public CreateHotParamItemsResponseBodyData setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public CreateHotParamItemsResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateHotParamItemsResponseBodyData setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public CreateHotParamItemsResponseBodyData setMetricType(Integer metricType) {
            this.metricType = metricType;
            return this;
        }
        public Integer getMetricType() {
            return this.metricType;
        }

        public CreateHotParamItemsResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateHotParamItemsResponseBodyData setParamFlowItemList(java.util.List<CreateHotParamItemsResponseBodyDataParamFlowItemList> paramFlowItemList) {
            this.paramFlowItemList = paramFlowItemList;
            return this;
        }
        public java.util.List<CreateHotParamItemsResponseBodyDataParamFlowItemList> getParamFlowItemList() {
            return this.paramFlowItemList;
        }

        public CreateHotParamItemsResponseBodyData setParamIdx(Integer paramIdx) {
            this.paramIdx = paramIdx;
            return this;
        }
        public Integer getParamIdx() {
            return this.paramIdx;
        }

        public CreateHotParamItemsResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public CreateHotParamItemsResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public CreateHotParamItemsResponseBodyData setStatDurationSec(Long statDurationSec) {
            this.statDurationSec = statDurationSec;
            return this;
        }
        public Long getStatDurationSec() {
            return this.statDurationSec;
        }

        public CreateHotParamItemsResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
