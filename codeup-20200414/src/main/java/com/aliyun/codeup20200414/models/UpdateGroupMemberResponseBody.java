// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class UpdateGroupMemberResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public UpdateGroupMemberResponseBodyResult result;

    public static UpdateGroupMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupMemberResponseBody self = new UpdateGroupMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGroupMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGroupMemberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateGroupMemberResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateGroupMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateGroupMemberResponseBody setResult(UpdateGroupMemberResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateGroupMemberResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateGroupMemberResponseBodyResult extends TeaModel {
        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Email")
        public String email;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("State")
        public String state;

        @NameInMap("AccessLevel")
        public Integer accessLevel;

        @NameInMap("Id")
        public Long id;

        public static UpdateGroupMemberResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateGroupMemberResponseBodyResult self = new UpdateGroupMemberResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateGroupMemberResponseBodyResult setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public UpdateGroupMemberResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateGroupMemberResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateGroupMemberResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateGroupMemberResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public UpdateGroupMemberResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
