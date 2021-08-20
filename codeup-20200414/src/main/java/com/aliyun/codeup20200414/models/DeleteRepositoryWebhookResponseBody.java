// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryWebhookResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public DeleteRepositoryWebhookResponseBodyResult result;

    public static DeleteRepositoryWebhookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryWebhookResponseBody self = new DeleteRepositoryWebhookResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryWebhookResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteRepositoryWebhookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRepositoryWebhookResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteRepositoryWebhookResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteRepositoryWebhookResponseBody setResult(DeleteRepositoryWebhookResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteRepositoryWebhookResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteRepositoryWebhookResponseBodyResult extends TeaModel {
        @NameInMap("PushEvents")
        public Boolean pushEvents;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Url")
        public String url;

        @NameInMap("TagPushEvents")
        public Boolean tagPushEvents;

        @NameInMap("LastTestResult")
        public String lastTestResult;

        @NameInMap("MergeRequestsEvents")
        public Boolean mergeRequestsEvents;

        @NameInMap("Description")
        public String description;

        @NameInMap("NoteEvents")
        public Boolean noteEvents;

        @NameInMap("SecretToken")
        public String secretToken;

        @NameInMap("Id")
        public Long id;

        @NameInMap("EnableSslVerification")
        public Boolean enableSslVerification;

        public static DeleteRepositoryWebhookResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteRepositoryWebhookResponseBodyResult self = new DeleteRepositoryWebhookResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteRepositoryWebhookResponseBodyResult setPushEvents(Boolean pushEvents) {
            this.pushEvents = pushEvents;
            return this;
        }
        public Boolean getPushEvents() {
            return this.pushEvents;
        }

        public DeleteRepositoryWebhookResponseBodyResult setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public DeleteRepositoryWebhookResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DeleteRepositoryWebhookResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DeleteRepositoryWebhookResponseBodyResult setTagPushEvents(Boolean tagPushEvents) {
            this.tagPushEvents = tagPushEvents;
            return this;
        }
        public Boolean getTagPushEvents() {
            return this.tagPushEvents;
        }

        public DeleteRepositoryWebhookResponseBodyResult setLastTestResult(String lastTestResult) {
            this.lastTestResult = lastTestResult;
            return this;
        }
        public String getLastTestResult() {
            return this.lastTestResult;
        }

        public DeleteRepositoryWebhookResponseBodyResult setMergeRequestsEvents(Boolean mergeRequestsEvents) {
            this.mergeRequestsEvents = mergeRequestsEvents;
            return this;
        }
        public Boolean getMergeRequestsEvents() {
            return this.mergeRequestsEvents;
        }

        public DeleteRepositoryWebhookResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteRepositoryWebhookResponseBodyResult setNoteEvents(Boolean noteEvents) {
            this.noteEvents = noteEvents;
            return this;
        }
        public Boolean getNoteEvents() {
            return this.noteEvents;
        }

        public DeleteRepositoryWebhookResponseBodyResult setSecretToken(String secretToken) {
            this.secretToken = secretToken;
            return this;
        }
        public String getSecretToken() {
            return this.secretToken;
        }

        public DeleteRepositoryWebhookResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteRepositoryWebhookResponseBodyResult setEnableSslVerification(Boolean enableSslVerification) {
            this.enableSslVerification = enableSslVerification;
            return this;
        }
        public Boolean getEnableSslVerification() {
            return this.enableSslVerification;
        }

    }

}
