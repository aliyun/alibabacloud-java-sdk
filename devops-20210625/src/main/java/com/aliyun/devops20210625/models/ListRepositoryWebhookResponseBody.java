// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryWebhookResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListRepositoryWebhookResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("total")
    public Long total;

    public static ListRepositoryWebhookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryWebhookResponseBody self = new ListRepositoryWebhookResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoryWebhookResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRepositoryWebhookResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRepositoryWebhookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoryWebhookResponseBody setResult(java.util.List<ListRepositoryWebhookResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoryWebhookResponseBodyResult> getResult() {
        return this.result;
    }

    public ListRepositoryWebhookResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRepositoryWebhookResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListRepositoryWebhookResponseBodyResult extends TeaModel {
        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("description")
        public String description;

        @NameInMap("enableSslVerification")
        public Boolean enableSslVerification;

        @NameInMap("id")
        public Long id;

        @NameInMap("lastTestResult")
        public String lastTestResult;

        @NameInMap("mergeRequestsEvents")
        public Boolean mergeRequestsEvents;

        @NameInMap("noteEvents")
        public Boolean noteEvents;

        @NameInMap("projectId")
        public Long projectId;

        @NameInMap("pushEvents")
        public Boolean pushEvents;

        @NameInMap("secretToken")
        public String secretToken;

        @NameInMap("tagPushEvents")
        public Boolean tagPushEvents;

        @NameInMap("url")
        public String url;

        public static ListRepositoryWebhookResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryWebhookResponseBodyResult self = new ListRepositoryWebhookResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoryWebhookResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRepositoryWebhookResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRepositoryWebhookResponseBodyResult setEnableSslVerification(Boolean enableSslVerification) {
            this.enableSslVerification = enableSslVerification;
            return this;
        }
        public Boolean getEnableSslVerification() {
            return this.enableSslVerification;
        }

        public ListRepositoryWebhookResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRepositoryWebhookResponseBodyResult setLastTestResult(String lastTestResult) {
            this.lastTestResult = lastTestResult;
            return this;
        }
        public String getLastTestResult() {
            return this.lastTestResult;
        }

        public ListRepositoryWebhookResponseBodyResult setMergeRequestsEvents(Boolean mergeRequestsEvents) {
            this.mergeRequestsEvents = mergeRequestsEvents;
            return this;
        }
        public Boolean getMergeRequestsEvents() {
            return this.mergeRequestsEvents;
        }

        public ListRepositoryWebhookResponseBodyResult setNoteEvents(Boolean noteEvents) {
            this.noteEvents = noteEvents;
            return this;
        }
        public Boolean getNoteEvents() {
            return this.noteEvents;
        }

        public ListRepositoryWebhookResponseBodyResult setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListRepositoryWebhookResponseBodyResult setPushEvents(Boolean pushEvents) {
            this.pushEvents = pushEvents;
            return this;
        }
        public Boolean getPushEvents() {
            return this.pushEvents;
        }

        public ListRepositoryWebhookResponseBodyResult setSecretToken(String secretToken) {
            this.secretToken = secretToken;
            return this;
        }
        public String getSecretToken() {
            return this.secretToken;
        }

        public ListRepositoryWebhookResponseBodyResult setTagPushEvents(Boolean tagPushEvents) {
            this.tagPushEvents = tagPushEvents;
            return this;
        }
        public Boolean getTagPushEvents() {
            return this.tagPushEvents;
        }

        public ListRepositoryWebhookResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
