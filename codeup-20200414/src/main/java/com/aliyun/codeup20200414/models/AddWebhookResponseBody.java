// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class AddWebhookResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public AddWebhookResponseBodyResult result;

    public static AddWebhookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddWebhookResponseBody self = new AddWebhookResponseBody();
        return TeaModel.build(map, self);
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

    public AddWebhookResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AddWebhookResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddWebhookResponseBody setResult(AddWebhookResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddWebhookResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddWebhookResponseBodyResult extends TeaModel {
        @NameInMap("PushEvents")
        public Boolean pushEvents;

        @NameInMap("BuildEvents")
        public Boolean buildEvents;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Url")
        public String url;

        @NameInMap("IssuesEvents")
        public Boolean issuesEvents;

        @NameInMap("TagPushEvents")
        public Boolean tagPushEvents;

        @NameInMap("LastTestResult")
        public String lastTestResult;

        @NameInMap("Description")
        public String description;

        @NameInMap("MergeRequestsEvents")
        public Boolean mergeRequestsEvents;

        @NameInMap("SecretToken")
        public String secretToken;

        @NameInMap("NoteEvents")
        public Boolean noteEvents;

        @NameInMap("Id")
        public Long id;

        @NameInMap("EnableSslVerification")
        public Boolean enableSslVerification;

        public static AddWebhookResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddWebhookResponseBodyResult self = new AddWebhookResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddWebhookResponseBodyResult setPushEvents(Boolean pushEvents) {
            this.pushEvents = pushEvents;
            return this;
        }
        public Boolean getPushEvents() {
            return this.pushEvents;
        }

        public AddWebhookResponseBodyResult setBuildEvents(Boolean buildEvents) {
            this.buildEvents = buildEvents;
            return this;
        }
        public Boolean getBuildEvents() {
            return this.buildEvents;
        }

        public AddWebhookResponseBodyResult setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public AddWebhookResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public AddWebhookResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public AddWebhookResponseBodyResult setIssuesEvents(Boolean issuesEvents) {
            this.issuesEvents = issuesEvents;
            return this;
        }
        public Boolean getIssuesEvents() {
            return this.issuesEvents;
        }

        public AddWebhookResponseBodyResult setTagPushEvents(Boolean tagPushEvents) {
            this.tagPushEvents = tagPushEvents;
            return this;
        }
        public Boolean getTagPushEvents() {
            return this.tagPushEvents;
        }

        public AddWebhookResponseBodyResult setLastTestResult(String lastTestResult) {
            this.lastTestResult = lastTestResult;
            return this;
        }
        public String getLastTestResult() {
            return this.lastTestResult;
        }

        public AddWebhookResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddWebhookResponseBodyResult setMergeRequestsEvents(Boolean mergeRequestsEvents) {
            this.mergeRequestsEvents = mergeRequestsEvents;
            return this;
        }
        public Boolean getMergeRequestsEvents() {
            return this.mergeRequestsEvents;
        }

        public AddWebhookResponseBodyResult setSecretToken(String secretToken) {
            this.secretToken = secretToken;
            return this;
        }
        public String getSecretToken() {
            return this.secretToken;
        }

        public AddWebhookResponseBodyResult setNoteEvents(Boolean noteEvents) {
            this.noteEvents = noteEvents;
            return this;
        }
        public Boolean getNoteEvents() {
            return this.noteEvents;
        }

        public AddWebhookResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AddWebhookResponseBodyResult setEnableSslVerification(Boolean enableSslVerification) {
            this.enableSslVerification = enableSslVerification;
            return this;
        }
        public Boolean getEnableSslVerification() {
            return this.enableSslVerification;
        }

    }

}
