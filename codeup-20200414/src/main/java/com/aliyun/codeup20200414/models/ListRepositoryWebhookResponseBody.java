// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryWebhookResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListRepositoryWebhookResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
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
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnableSslVerification")
        public Boolean enableSslVerification;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LastTestResult")
        public String lastTestResult;

        @NameInMap("MergeRequestsEvents")
        public Boolean mergeRequestsEvents;

        @NameInMap("NoteEvents")
        public Boolean noteEvents;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("PushEvents")
        public Boolean pushEvents;

        @NameInMap("SecretToken")
        public String secretToken;

        @NameInMap("TagPushEvents")
        public Boolean tagPushEvents;

        @NameInMap("Url")
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
