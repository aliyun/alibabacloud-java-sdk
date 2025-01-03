// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateCommitStatusResponseBody extends TeaModel {
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
     * <p>020F71F3-F063-5B8B-8978-2B01833216BB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateCommitStatusResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateCommitStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCommitStatusResponseBody self = new CreateCommitStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCommitStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateCommitStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateCommitStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCommitStatusResponseBody setResult(CreateCommitStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateCommitStatusResponseBodyResult getResult() {
        return this.result;
    }

    public CreateCommitStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateCommitStatusResponseBodyResultCreator extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>204485087002425236</p>
         */
        @NameInMap("aliyunPk")
        public Long aliyunPk;

        /**
         * <strong>example:</strong>
         * <p><a href="https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100">https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100</a></p>
         */
        @NameInMap("avatarUrl")
        public String avatarUrl;

        /**
         * <strong>example:</strong>
         * <p>codeup</p>
         */
        @NameInMap("login")
        public String login;

        /**
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateCommitStatusResponseBodyResultCreator build(java.util.Map<String, ?> map) throws Exception {
            CreateCommitStatusResponseBodyResultCreator self = new CreateCommitStatusResponseBodyResultCreator();
            return TeaModel.build(map, self);
        }

        public CreateCommitStatusResponseBodyResultCreator setAliyunPk(Long aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public Long getAliyunPk() {
            return this.aliyunPk;
        }

        public CreateCommitStatusResponseBodyResultCreator setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateCommitStatusResponseBodyResultCreator setLogin(String login) {
            this.login = login;
            return this;
        }
        public String getLogin() {
            return this.login;
        }

        public CreateCommitStatusResponseBodyResultCreator setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateCommitStatusResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("context")
        public String context;

        @NameInMap("creator")
        public CreateCommitStatusResponseBodyResultCreator creator;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>30815</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>c0ca103441b9fa7f369be8d24a6f20db44dfddf7</p>
         */
        @NameInMap("sha")
        public String sha;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("targetUrl")
        public String targetUrl;

        public static CreateCommitStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateCommitStatusResponseBodyResult self = new CreateCommitStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateCommitStatusResponseBodyResult setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public CreateCommitStatusResponseBodyResult setCreator(CreateCommitStatusResponseBodyResultCreator creator) {
            this.creator = creator;
            return this;
        }
        public CreateCommitStatusResponseBodyResultCreator getCreator() {
            return this.creator;
        }

        public CreateCommitStatusResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateCommitStatusResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateCommitStatusResponseBodyResult setSha(String sha) {
            this.sha = sha;
            return this;
        }
        public String getSha() {
            return this.sha;
        }

        public CreateCommitStatusResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateCommitStatusResponseBodyResult setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

    }

}
