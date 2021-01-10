// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAIPlanResponseBodyData data;

    public static GetAIPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAIPlanResponseBody self = new GetAIPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAIPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAIPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAIPlanResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAIPlanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAIPlanResponseBody setData(GetAIPlanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAIPlanResponseBodyData getData() {
        return this.data;
    }

    public static class GetAIPlanResponseBodyData extends TeaModel {
        @NameInMap("PlanId")
        public String planId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("PlanTemplateId")
        public String planTemplateId;

        @NameInMap("TriggerEnum")
        public Integer triggerEnum;

        @NameInMap("IntervalTiming")
        public Integer intervalTiming;

        @NameInMap("PreTiming")
        public Long preTiming;

        @NameInMap("Description")
        public String description;

        public static GetAIPlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAIPlanResponseBodyData self = new GetAIPlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAIPlanResponseBodyData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public GetAIPlanResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAIPlanResponseBodyData setPlanTemplateId(String planTemplateId) {
            this.planTemplateId = planTemplateId;
            return this;
        }
        public String getPlanTemplateId() {
            return this.planTemplateId;
        }

        public GetAIPlanResponseBodyData setTriggerEnum(Integer triggerEnum) {
            this.triggerEnum = triggerEnum;
            return this;
        }
        public Integer getTriggerEnum() {
            return this.triggerEnum;
        }

        public GetAIPlanResponseBodyData setIntervalTiming(Integer intervalTiming) {
            this.intervalTiming = intervalTiming;
            return this;
        }
        public Integer getIntervalTiming() {
            return this.intervalTiming;
        }

        public GetAIPlanResponseBodyData setPreTiming(Long preTiming) {
            this.preTiming = preTiming;
            return this;
        }
        public Long getPreTiming() {
            return this.preTiming;
        }

        public GetAIPlanResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
