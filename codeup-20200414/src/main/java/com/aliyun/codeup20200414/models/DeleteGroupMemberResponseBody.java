// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteGroupMemberResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeleteGroupMemberResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteGroupMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupMemberResponseBody self = new DeleteGroupMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGroupMemberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteGroupMemberResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteGroupMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteGroupMemberResponseBody setResult(DeleteGroupMemberResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteGroupMemberResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteGroupMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteGroupMemberResponseBodyResult extends TeaModel {
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

        public static DeleteGroupMemberResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteGroupMemberResponseBodyResult self = new DeleteGroupMemberResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteGroupMemberResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public DeleteGroupMemberResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public DeleteGroupMemberResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DeleteGroupMemberResponseBodyResult setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public DeleteGroupMemberResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteGroupMemberResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
