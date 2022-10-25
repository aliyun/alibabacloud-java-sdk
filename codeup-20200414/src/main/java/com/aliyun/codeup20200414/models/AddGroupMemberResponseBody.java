// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class AddGroupMemberResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<AddGroupMemberResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static AddGroupMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddGroupMemberResponseBody self = new AddGroupMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public AddGroupMemberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AddGroupMemberResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddGroupMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddGroupMemberResponseBody setResult(java.util.List<AddGroupMemberResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<AddGroupMemberResponseBodyResult> getResult() {
        return this.result;
    }

    public AddGroupMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddGroupMemberResponseBodyResult extends TeaModel {
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

        public static AddGroupMemberResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddGroupMemberResponseBodyResult self = new AddGroupMemberResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddGroupMemberResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public AddGroupMemberResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public AddGroupMemberResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public AddGroupMemberResponseBodyResult setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public AddGroupMemberResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AddGroupMemberResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
