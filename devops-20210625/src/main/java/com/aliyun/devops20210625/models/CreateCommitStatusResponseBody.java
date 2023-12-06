// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateCommitStatusResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateCommitStatusResponseBodyResult result;

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
        @NameInMap("aliyunPk")
        public Long aliyunPk;

        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("login")
        public String login;

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
        @NameInMap("context")
        public String context;

        @NameInMap("creator")
        public CreateCommitStatusResponseBodyResultCreator creator;

        @NameInMap("description")
        public String description;

        @NameInMap("id")
        public Long id;

        @NameInMap("sha")
        public String sha;

        @NameInMap("state")
        public String state;

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
