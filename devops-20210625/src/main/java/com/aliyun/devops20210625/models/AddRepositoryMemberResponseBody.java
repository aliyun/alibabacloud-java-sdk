// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class AddRepositoryMemberResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<AddRepositoryMemberResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

    public static AddRepositoryMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddRepositoryMemberResponseBody self = new AddRepositoryMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public AddRepositoryMemberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AddRepositoryMemberResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddRepositoryMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddRepositoryMemberResponseBody setResult(java.util.List<AddRepositoryMemberResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<AddRepositoryMemberResponseBodyResult> getResult() {
        return this.result;
    }

    public AddRepositoryMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddRepositoryMemberResponseBodyResult extends TeaModel {
        @NameInMap("accessLevel")
        public Integer accessLevel;

        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("email")
        public String email;

        @NameInMap("id")
        public Long id;

        @NameInMap("state")
        public String state;

        public static AddRepositoryMemberResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddRepositoryMemberResponseBodyResult self = new AddRepositoryMemberResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddRepositoryMemberResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public AddRepositoryMemberResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public AddRepositoryMemberResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public AddRepositoryMemberResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AddRepositoryMemberResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
