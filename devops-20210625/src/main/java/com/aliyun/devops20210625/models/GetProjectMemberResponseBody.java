// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetProjectMemberResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetProjectMemberResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static GetProjectMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectMemberResponseBody self = new GetProjectMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectMemberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetProjectMemberResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetProjectMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectMemberResponseBody setResult(GetProjectMemberResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetProjectMemberResponseBodyResult getResult() {
        return this.result;
    }

    public GetProjectMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProjectMemberResponseBodyResult extends TeaModel {
        @NameInMap("accessLevel")
        public Integer accessLevel;

        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("email")
        public String email;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        public static GetProjectMemberResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetProjectMemberResponseBodyResult self = new GetProjectMemberResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetProjectMemberResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public GetProjectMemberResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetProjectMemberResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetProjectMemberResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetProjectMemberResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
