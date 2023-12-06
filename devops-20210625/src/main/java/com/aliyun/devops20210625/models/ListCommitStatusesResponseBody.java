// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListCommitStatusesResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListCommitStatusesResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("total")
    public Long total;

    public static ListCommitStatusesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCommitStatusesResponseBody self = new ListCommitStatusesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCommitStatusesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListCommitStatusesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListCommitStatusesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCommitStatusesResponseBody setResult(java.util.List<ListCommitStatusesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListCommitStatusesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListCommitStatusesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListCommitStatusesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListCommitStatusesResponseBodyResultCreator extends TeaModel {
        @NameInMap("aliyunPk")
        public String aliyunPk;

        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("login")
        public String login;

        @NameInMap("type")
        public String type;

        public static ListCommitStatusesResponseBodyResultCreator build(java.util.Map<String, ?> map) throws Exception {
            ListCommitStatusesResponseBodyResultCreator self = new ListCommitStatusesResponseBodyResultCreator();
            return TeaModel.build(map, self);
        }

        public ListCommitStatusesResponseBodyResultCreator setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public ListCommitStatusesResponseBodyResultCreator setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListCommitStatusesResponseBodyResultCreator setLogin(String login) {
            this.login = login;
            return this;
        }
        public String getLogin() {
            return this.login;
        }

        public ListCommitStatusesResponseBodyResultCreator setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListCommitStatusesResponseBodyResult extends TeaModel {
        @NameInMap("context")
        public String context;

        @NameInMap("creator")
        public ListCommitStatusesResponseBodyResultCreator creator;

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

        public static ListCommitStatusesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListCommitStatusesResponseBodyResult self = new ListCommitStatusesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListCommitStatusesResponseBodyResult setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public ListCommitStatusesResponseBodyResult setCreator(ListCommitStatusesResponseBodyResultCreator creator) {
            this.creator = creator;
            return this;
        }
        public ListCommitStatusesResponseBodyResultCreator getCreator() {
            return this.creator;
        }

        public ListCommitStatusesResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCommitStatusesResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCommitStatusesResponseBodyResult setSha(String sha) {
            this.sha = sha;
            return this;
        }
        public String getSha() {
            return this.sha;
        }

        public ListCommitStatusesResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListCommitStatusesResponseBodyResult setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

    }

}
