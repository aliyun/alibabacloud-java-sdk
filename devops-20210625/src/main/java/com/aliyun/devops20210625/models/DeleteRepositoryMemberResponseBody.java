// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteRepositoryMemberResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeleteRepositoryMemberResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static DeleteRepositoryMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryMemberResponseBody self = new DeleteRepositoryMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryMemberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteRepositoryMemberResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteRepositoryMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRepositoryMemberResponseBody setResult(DeleteRepositoryMemberResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteRepositoryMemberResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteRepositoryMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteRepositoryMemberResponseBodyResult extends TeaModel {
        @NameInMap("accessLevel")
        public Integer accessLevel;

        @NameInMap("createAt")
        public String createAt;

        @NameInMap("id")
        public Long id;

        @NameInMap("sourceId")
        public Long sourceId;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("updateAt")
        public String updateAt;

        @NameInMap("userId")
        public Long userId;

        public static DeleteRepositoryMemberResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteRepositoryMemberResponseBodyResult self = new DeleteRepositoryMemberResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteRepositoryMemberResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public DeleteRepositoryMemberResponseBodyResult setCreateAt(String createAt) {
            this.createAt = createAt;
            return this;
        }
        public String getCreateAt() {
            return this.createAt;
        }

        public DeleteRepositoryMemberResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteRepositoryMemberResponseBodyResult setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public DeleteRepositoryMemberResponseBodyResult setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DeleteRepositoryMemberResponseBodyResult setUpdateAt(String updateAt) {
            this.updateAt = updateAt;
            return this;
        }
        public String getUpdateAt() {
            return this.updateAt;
        }

        public DeleteRepositoryMemberResponseBodyResult setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
