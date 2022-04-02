// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class AddWebhookResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public AddWebhookResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static AddWebhookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddWebhookResponseBody self = new AddWebhookResponseBody();
        return TeaModel.build(map, self);
    }

    public AddWebhookResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AddWebhookResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddWebhookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddWebhookResponseBody setResult(AddWebhookResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddWebhookResponseBodyResult getResult() {
        return this.result;
    }

    public AddWebhookResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddWebhookResponseBodyResult extends TeaModel {
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

        @NameInMap("pushEvents")
        public Boolean pushEvents;

        @NameInMap("repositoryId")
        public Long repositoryId;

        @NameInMap("secretToken")
        public String secretToken;

        @NameInMap("tagPushEvents")
        public Boolean tagPushEvents;

        @NameInMap("url")
        public String url;

        public static AddWebhookResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddWebhookResponseBodyResult self = new AddWebhookResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddWebhookResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public AddWebhookResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddWebhookResponseBodyResult setEnableSslVerification(Boolean enableSslVerification) {
            this.enableSslVerification = enableSslVerification;
            return this;
        }
        public Boolean getEnableSslVerification() {
            return this.enableSslVerification;
        }

        public AddWebhookResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AddWebhookResponseBodyResult setLastTestResult(String lastTestResult) {
            this.lastTestResult = lastTestResult;
            return this;
        }
        public String getLastTestResult() {
            return this.lastTestResult;
        }

        public AddWebhookResponseBodyResult setMergeRequestsEvents(Boolean mergeRequestsEvents) {
            this.mergeRequestsEvents = mergeRequestsEvents;
            return this;
        }
        public Boolean getMergeRequestsEvents() {
            return this.mergeRequestsEvents;
        }

        public AddWebhookResponseBodyResult setNoteEvents(Boolean noteEvents) {
            this.noteEvents = noteEvents;
            return this;
        }
        public Boolean getNoteEvents() {
            return this.noteEvents;
        }

        public AddWebhookResponseBodyResult setPushEvents(Boolean pushEvents) {
            this.pushEvents = pushEvents;
            return this;
        }
        public Boolean getPushEvents() {
            return this.pushEvents;
        }

        public AddWebhookResponseBodyResult setRepositoryId(Long repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }
        public Long getRepositoryId() {
            return this.repositoryId;
        }

        public AddWebhookResponseBodyResult setSecretToken(String secretToken) {
            this.secretToken = secretToken;
            return this;
        }
        public String getSecretToken() {
            return this.secretToken;
        }

        public AddWebhookResponseBodyResult setTagPushEvents(Boolean tagPushEvents) {
            this.tagPushEvents = tagPushEvents;
            return this;
        }
        public Boolean getTagPushEvents() {
            return this.tagPushEvents;
        }

        public AddWebhookResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
