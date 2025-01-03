// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteRepositoryWebhookResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>F7B85D1B-D1C2-140F-A039-341859F130B9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeleteRepositoryWebhookResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeleteRepositoryWebhookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryWebhookResponseBody self = new DeleteRepositoryWebhookResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryWebhookResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
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

    public DeleteRepositoryWebhookResponseBody setResult(DeleteRepositoryWebhookResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteRepositoryWebhookResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteRepositoryWebhookResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteRepositoryWebhookResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("buildEvents")
        public Boolean buildEvents;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 14:24:54</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enableSslVerification")
        public Boolean enableSslVerification;

        /**
         * <strong>example:</strong>
         * <p>524836</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("issuesEvents")
        public Boolean issuesEvents;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("lastTestResult")
        public String lastTestResult;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("mergeRequestsEvents")
        public Boolean mergeRequestsEvents;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("noteEvents")
        public Boolean noteEvents;

        /**
         * <strong>example:</strong>
         * <p>2369234</p>
         */
        @NameInMap("projectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("pushEvents")
        public Boolean pushEvents;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("secretToken")
        public String secretToken;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("tagPushEvents")
        public Boolean tagPushEvents;

        /**
         * <strong>example:</strong>
         * <p>ProjectHook</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxxx">https://xxxxx</a></p>
         */
        @NameInMap("url")
        public String url;

        public static DeleteRepositoryWebhookResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteRepositoryWebhookResponseBodyResult self = new DeleteRepositoryWebhookResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteRepositoryWebhookResponseBodyResult setBuildEvents(Boolean buildEvents) {
            this.buildEvents = buildEvents;
            return this;
        }
        public Boolean getBuildEvents() {
            return this.buildEvents;
        }

        public DeleteRepositoryWebhookResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DeleteRepositoryWebhookResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteRepositoryWebhookResponseBodyResult setEnableSslVerification(Boolean enableSslVerification) {
            this.enableSslVerification = enableSslVerification;
            return this;
        }
        public Boolean getEnableSslVerification() {
            return this.enableSslVerification;
        }

        public DeleteRepositoryWebhookResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteRepositoryWebhookResponseBodyResult setIssuesEvents(Boolean issuesEvents) {
            this.issuesEvents = issuesEvents;
            return this;
        }
        public Boolean getIssuesEvents() {
            return this.issuesEvents;
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

        public DeleteRepositoryWebhookResponseBodyResult setNoteEvents(Boolean noteEvents) {
            this.noteEvents = noteEvents;
            return this;
        }
        public Boolean getNoteEvents() {
            return this.noteEvents;
        }

        public DeleteRepositoryWebhookResponseBodyResult setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public DeleteRepositoryWebhookResponseBodyResult setPushEvents(Boolean pushEvents) {
            this.pushEvents = pushEvents;
            return this;
        }
        public Boolean getPushEvents() {
            return this.pushEvents;
        }

        public DeleteRepositoryWebhookResponseBodyResult setSecretToken(String secretToken) {
            this.secretToken = secretToken;
            return this;
        }
        public String getSecretToken() {
            return this.secretToken;
        }

        public DeleteRepositoryWebhookResponseBodyResult setTagPushEvents(Boolean tagPushEvents) {
            this.tagPushEvents = tagPushEvents;
            return this;
        }
        public Boolean getTagPushEvents() {
            return this.tagPushEvents;
        }

        public DeleteRepositoryWebhookResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DeleteRepositoryWebhookResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
