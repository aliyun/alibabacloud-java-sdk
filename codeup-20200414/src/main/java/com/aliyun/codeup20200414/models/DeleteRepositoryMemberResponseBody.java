// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryMemberResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public DeleteRepositoryMemberResponseBodyResult result;

    public static DeleteRepositoryMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryMemberResponseBody self = new DeleteRepositoryMemberResponseBody();
        return TeaModel.build(map, self);
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

    public DeleteRepositoryMemberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteRepositoryMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteRepositoryMemberResponseBody setResult(DeleteRepositoryMemberResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteRepositoryMemberResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteRepositoryMemberResponseBodyResult extends TeaModel {
        @NameInMap("UserId")
        public Long userId;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Message")
        public String message;

        @NameInMap("AccessLevel")
        public Integer accessLevel;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("SourceId")
        public Long sourceId;

        @NameInMap("NotificationLevel")
        public Integer notificationLevel;

        @NameInMap("Id")
        public Long id;

        public static DeleteRepositoryMemberResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteRepositoryMemberResponseBodyResult self = new DeleteRepositoryMemberResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteRepositoryMemberResponseBodyResult setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DeleteRepositoryMemberResponseBodyResult setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DeleteRepositoryMemberResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DeleteRepositoryMemberResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteRepositoryMemberResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public DeleteRepositoryMemberResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public DeleteRepositoryMemberResponseBodyResult setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public DeleteRepositoryMemberResponseBodyResult setNotificationLevel(Integer notificationLevel) {
            this.notificationLevel = notificationLevel;
            return this;
        }
        public Integer getNotificationLevel() {
            return this.notificationLevel;
        }

        public DeleteRepositoryMemberResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
