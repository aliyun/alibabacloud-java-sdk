// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class UpdateRepositoryMemberResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateRepositoryMemberResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateRepositoryMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepositoryMemberResponseBody self = new UpdateRepositoryMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRepositoryMemberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateRepositoryMemberResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateRepositoryMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRepositoryMemberResponseBody setResult(UpdateRepositoryMemberResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateRepositoryMemberResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateRepositoryMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateRepositoryMemberResponseBodyResult extends TeaModel {
        @NameInMap("AccessLevel")
        public Integer accessLevel;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Email")
        public String email;

        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("State")
        public String state;

        public static UpdateRepositoryMemberResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateRepositoryMemberResponseBodyResult self = new UpdateRepositoryMemberResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateRepositoryMemberResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public UpdateRepositoryMemberResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateRepositoryMemberResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateRepositoryMemberResponseBodyResult setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public UpdateRepositoryMemberResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateRepositoryMemberResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
