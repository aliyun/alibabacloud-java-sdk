// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class AddWebhookResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_NOT_FOUND_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>6177543A-8D54-5736-A93B-E0195A1512CB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public AddWebhookResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2022-03-12 12:00:00</p>
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
         * <p>30815</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
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
         * <p>false</p>
         */
        @NameInMap("noteEvents")
        public Boolean noteEvents;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("pushEvents")
        public Boolean pushEvents;

        /**
         * <strong>example:</strong>
         * <p>2835387</p>
         */
        @NameInMap("repositoryId")
        public Long repositoryId;

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
         * <p><a href="https://xxxxx">https://xxxxx</a></p>
         */
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
