// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIPlanResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public GetAIPlanResponseData data;

    public static GetAIPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIPlanResponse self = new GetAIPlanResponse();
        return TeaModel.build(map, self);
    }

    public GetAIPlanResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAIPlanResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAIPlanResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAIPlanResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAIPlanResponse setData(GetAIPlanResponseData data) {
        this.data = data;
        return this;
    }
    public GetAIPlanResponseData getData() {
        return this.data;
    }

    public static class GetAIPlanResponseData extends TeaModel {
        @NameInMap("PlanId")
        @Validation(required = true)
        public String planId;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("PlanTemplateId")
        @Validation(required = true)
        public String planTemplateId;

        @NameInMap("TriggerEnum")
        @Validation(required = true)
        public Integer triggerEnum;

        @NameInMap("IntervalTiming")
        @Validation(required = true)
        public Integer intervalTiming;

        @NameInMap("PreTiming")
        @Validation(required = true)
        public Long preTiming;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static GetAIPlanResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetAIPlanResponseData self = new GetAIPlanResponseData();
            return TeaModel.build(map, self);
        }

        public GetAIPlanResponseData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public GetAIPlanResponseData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAIPlanResponseData setPlanTemplateId(String planTemplateId) {
            this.planTemplateId = planTemplateId;
            return this;
        }
        public String getPlanTemplateId() {
            return this.planTemplateId;
        }

        public GetAIPlanResponseData setTriggerEnum(Integer triggerEnum) {
            this.triggerEnum = triggerEnum;
            return this;
        }
        public Integer getTriggerEnum() {
            return this.triggerEnum;
        }

        public GetAIPlanResponseData setIntervalTiming(Integer intervalTiming) {
            this.intervalTiming = intervalTiming;
            return this;
        }
        public Integer getIntervalTiming() {
            return this.intervalTiming;
        }

        public GetAIPlanResponseData setPreTiming(Long preTiming) {
            this.preTiming = preTiming;
            return this;
        }
        public Long getPreTiming() {
            return this.preTiming;
        }

        public GetAIPlanResponseData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
