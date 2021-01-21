// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIPlanTemplatesResponse extends TeaModel {
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
    public java.util.List<QueryAIPlanTemplatesResponseData> data;

    public static QueryAIPlanTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAIPlanTemplatesResponse self = new QueryAIPlanTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public QueryAIPlanTemplatesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAIPlanTemplatesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAIPlanTemplatesResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryAIPlanTemplatesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAIPlanTemplatesResponse setData(java.util.List<QueryAIPlanTemplatesResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAIPlanTemplatesResponseData> getData() {
        return this.data;
    }

    public static class QueryAIPlanTemplatesResponseData extends TeaModel {
        @NameInMap("PlanTemplateId")
        @Validation(required = true)
        public String planTemplateId;

        @NameInMap("AppTemplateId")
        @Validation(required = true)
        public String appTemplateId;

        @NameInMap("AppVersion")
        @Validation(required = true)
        public String appVersion;

        @NameInMap("TriggerEnum")
        @Validation(required = true)
        public Integer triggerEnum;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("IntervalTiming")
        @Validation(required = true)
        public Integer intervalTiming;

        public static QueryAIPlanTemplatesResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryAIPlanTemplatesResponseData self = new QueryAIPlanTemplatesResponseData();
            return TeaModel.build(map, self);
        }

        public QueryAIPlanTemplatesResponseData setPlanTemplateId(String planTemplateId) {
            this.planTemplateId = planTemplateId;
            return this;
        }
        public String getPlanTemplateId() {
            return this.planTemplateId;
        }

        public QueryAIPlanTemplatesResponseData setAppTemplateId(String appTemplateId) {
            this.appTemplateId = appTemplateId;
            return this;
        }
        public String getAppTemplateId() {
            return this.appTemplateId;
        }

        public QueryAIPlanTemplatesResponseData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public QueryAIPlanTemplatesResponseData setTriggerEnum(Integer triggerEnum) {
            this.triggerEnum = triggerEnum;
            return this;
        }
        public Integer getTriggerEnum() {
            return this.triggerEnum;
        }

        public QueryAIPlanTemplatesResponseData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryAIPlanTemplatesResponseData setIntervalTiming(Integer intervalTiming) {
            this.intervalTiming = intervalTiming;
            return this;
        }
        public Integer getIntervalTiming() {
            return this.intervalTiming;
        }

    }

}
