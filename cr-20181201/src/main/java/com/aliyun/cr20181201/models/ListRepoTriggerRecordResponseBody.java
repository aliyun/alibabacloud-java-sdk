// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoTriggerRecordResponseBody extends TeaModel {
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RepoTriggerRecords")
    public java.util.List<ListRepoTriggerRecordResponseBodyRepoTriggerRecords> repoTriggerRecords;

    @NameInMap("Code")
    public String code;

    public static ListRepoTriggerRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepoTriggerRecordResponseBody self = new ListRepoTriggerRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepoTriggerRecordResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListRepoTriggerRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepoTriggerRecordResponseBody setRepoTriggerRecords(java.util.List<ListRepoTriggerRecordResponseBodyRepoTriggerRecords> repoTriggerRecords) {
        this.repoTriggerRecords = repoTriggerRecords;
        return this;
    }
    public java.util.List<ListRepoTriggerRecordResponseBodyRepoTriggerRecords> getRepoTriggerRecords() {
        return this.repoTriggerRecords;
    }

    public ListRepoTriggerRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListRepoTriggerRecordResponseBodyRepoTriggerRecords extends TeaModel {
        @NameInMap("RequestHeaders")
        public String requestHeaders;

        @NameInMap("ResponseHeaders")
        public String responseHeaders;

        @NameInMap("TriggerName")
        public String triggerName;

        @NameInMap("TriggerLogId")
        public String triggerLogId;

        @NameInMap("RequestBody")
        public String requestBody;

        @NameInMap("TriggerUrl")
        public String triggerUrl;

        @NameInMap("ResponseBody")
        public String responseBody;

        @NameInMap("TriggerTag")
        public String triggerTag;

        @NameInMap("TriggerType")
        public String triggerType;

        @NameInMap("StatusCode")
        public String statusCode;

        @NameInMap("RepoEvent")
        public String repoEvent;

        @NameInMap("TriggerId")
        public String triggerId;

        @NameInMap("RequestTime")
        public Long requestTime;

        public static ListRepoTriggerRecordResponseBodyRepoTriggerRecords build(java.util.Map<String, ?> map) throws Exception {
            ListRepoTriggerRecordResponseBodyRepoTriggerRecords self = new ListRepoTriggerRecordResponseBodyRepoTriggerRecords();
            return TeaModel.build(map, self);
        }

        public ListRepoTriggerRecordResponseBodyRepoTriggerRecords setRequestHeaders(String requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public String getRequestHeaders() {
            return this.requestHeaders;
        }

        public ListRepoTriggerRecordResponseBodyRepoTriggerRecords setResponseHeaders(String responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }
        public String getResponseHeaders() {
            return this.responseHeaders;
        }

        public ListRepoTriggerRecordResponseBodyRepoTriggerRecords setTriggerName(String triggerName) {
            this.triggerName = triggerName;
            return this;
        }
        public String getTriggerName() {
            return this.triggerName;
        }

        public ListRepoTriggerRecordResponseBodyRepoTriggerRecords setTriggerLogId(String triggerLogId) {
            this.triggerLogId = triggerLogId;
            return this;
        }
        public String getTriggerLogId() {
            return this.triggerLogId;
        }

        public ListRepoTriggerRecordResponseBodyRepoTriggerRecords setRequestBody(String requestBody) {
            this.requestBody = requestBody;
            return this;
        }
        public String getRequestBody() {
            return this.requestBody;
        }

        public ListRepoTriggerRecordResponseBodyRepoTriggerRecords setTriggerUrl(String triggerUrl) {
            this.triggerUrl = triggerUrl;
            return this;
        }
        public String getTriggerUrl() {
            return this.triggerUrl;
        }

        public ListRepoTriggerRecordResponseBodyRepoTriggerRecords setResponseBody(String responseBody) {
            this.responseBody = responseBody;
            return this;
        }
        public String getResponseBody() {
            return this.responseBody;
        }

        public ListRepoTriggerRecordResponseBodyRepoTriggerRecords setTriggerTag(String triggerTag) {
            this.triggerTag = triggerTag;
            return this;
        }
        public String getTriggerTag() {
            return this.triggerTag;
        }

        public ListRepoTriggerRecordResponseBodyRepoTriggerRecords setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public ListRepoTriggerRecordResponseBodyRepoTriggerRecords setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public ListRepoTriggerRecordResponseBodyRepoTriggerRecords setRepoEvent(String repoEvent) {
            this.repoEvent = repoEvent;
            return this;
        }
        public String getRepoEvent() {
            return this.repoEvent;
        }

        public ListRepoTriggerRecordResponseBodyRepoTriggerRecords setTriggerId(String triggerId) {
            this.triggerId = triggerId;
            return this;
        }
        public String getTriggerId() {
            return this.triggerId;
        }

        public ListRepoTriggerRecordResponseBodyRepoTriggerRecords setRequestTime(Long requestTime) {
            this.requestTime = requestTime;
            return this;
        }
        public Long getRequestTime() {
            return this.requestTime;
        }

    }

}
