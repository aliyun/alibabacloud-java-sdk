// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetUserInfoResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetUserInfoResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserInfoResponseBody self = new GetUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetUserInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserInfoResponseBody setResult(GetUserInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetUserInfoResponseBodyResult getResult() {
        return this.result;
    }

    public GetUserInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserInfoResponseBodyResult extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Email")
        public String email;

        @NameInMap("ExternalUserId")
        public String externalUserId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Username")
        public String username;

        public static GetUserInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetUserInfoResponseBodyResult self = new GetUserInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetUserInfoResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetUserInfoResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUserInfoResponseBodyResult setExternalUserId(String externalUserId) {
            this.externalUserId = externalUserId;
            return this;
        }
        public String getExternalUserId() {
            return this.externalUserId;
        }

        public GetUserInfoResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetUserInfoResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetUserInfoResponseBodyResult setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
