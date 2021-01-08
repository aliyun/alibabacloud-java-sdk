// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryMemberResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<ListRepositoryMemberResponseBodyResult> result;

    public static ListRepositoryMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryMemberResponseBody self = new ListRepositoryMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoryMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoryMemberResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListRepositoryMemberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRepositoryMemberResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRepositoryMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRepositoryMemberResponseBody setResult(java.util.List<ListRepositoryMemberResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoryMemberResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListRepositoryMemberResponseBodyResult extends TeaModel {
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

        public static ListRepositoryMemberResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryMemberResponseBodyResult self = new ListRepositoryMemberResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoryMemberResponseBodyResult setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public ListRepositoryMemberResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListRepositoryMemberResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListRepositoryMemberResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListRepositoryMemberResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public ListRepositoryMemberResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
