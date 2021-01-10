// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIPlanTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryAIPlanTemplatesResponseBodyData> data;

    public static QueryAIPlanTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAIPlanTemplatesResponseBody self = new QueryAIPlanTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAIPlanTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAIPlanTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAIPlanTemplatesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryAIPlanTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAIPlanTemplatesResponseBody setData(java.util.List<QueryAIPlanTemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAIPlanTemplatesResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryAIPlanTemplatesResponseBodyData extends TeaModel {
        @NameInMap("PlanTemplateId")
        public String planTemplateId;

        @NameInMap("AppTemplateId")
        public String appTemplateId;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("TriggerEnum")
        public Integer triggerEnum;

        @NameInMap("Description")
        public String description;

        @NameInMap("IntervalTiming")
        public Integer intervalTiming;

        public static QueryAIPlanTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAIPlanTemplatesResponseBodyData self = new QueryAIPlanTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAIPlanTemplatesResponseBodyData setPlanTemplateId(String planTemplateId) {
            this.planTemplateId = planTemplateId;
            return this;
        }
        public String getPlanTemplateId() {
            return this.planTemplateId;
        }

        public QueryAIPlanTemplatesResponseBodyData setAppTemplateId(String appTemplateId) {
            this.appTemplateId = appTemplateId;
            return this;
        }
        public String getAppTemplateId() {
            return this.appTemplateId;
        }

        public QueryAIPlanTemplatesResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public QueryAIPlanTemplatesResponseBodyData setTriggerEnum(Integer triggerEnum) {
            this.triggerEnum = triggerEnum;
            return this;
        }
        public Integer getTriggerEnum() {
            return this.triggerEnum;
        }

        public QueryAIPlanTemplatesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryAIPlanTemplatesResponseBodyData setIntervalTiming(Integer intervalTiming) {
            this.intervalTiming = intervalTiming;
            return this;
        }
        public Integer getIntervalTiming() {
            return this.intervalTiming;
        }

    }

}
