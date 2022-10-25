// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryMemberWithExternUidResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeleteRepositoryMemberWithExternUidResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteRepositoryMemberWithExternUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryMemberWithExternUidResponseBody self = new DeleteRepositoryMemberWithExternUidResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryMemberWithExternUidResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteRepositoryMemberWithExternUidResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteRepositoryMemberWithExternUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRepositoryMemberWithExternUidResponseBody setResult(DeleteRepositoryMemberWithExternUidResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteRepositoryMemberWithExternUidResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteRepositoryMemberWithExternUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteRepositoryMemberWithExternUidResponseBodyResult extends TeaModel {
        @NameInMap("AccessLevel")
        public Integer accessLevel;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public Long id;

        @NameInMap("SourceId")
        public Long sourceId;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("UserId")
        public Long userId;

        public static DeleteRepositoryMemberWithExternUidResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteRepositoryMemberWithExternUidResponseBodyResult self = new DeleteRepositoryMemberWithExternUidResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteRepositoryMemberWithExternUidResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public DeleteRepositoryMemberWithExternUidResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DeleteRepositoryMemberWithExternUidResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteRepositoryMemberWithExternUidResponseBodyResult setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public DeleteRepositoryMemberWithExternUidResponseBodyResult setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DeleteRepositoryMemberWithExternUidResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public DeleteRepositoryMemberWithExternUidResponseBodyResult setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
