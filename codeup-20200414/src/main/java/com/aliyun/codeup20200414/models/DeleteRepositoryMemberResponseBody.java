// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryMemberResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeleteRepositoryMemberResponseBodyResult result;

    @NameInMap("Success")
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
        @NameInMap("AccessLevel")
        public Integer accessLevel;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Message")
        public String message;

        @NameInMap("NotificationLevel")
        public Integer notificationLevel;

        @NameInMap("SourceId")
        public Long sourceId;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("UserId")
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

        public DeleteRepositoryMemberResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DeleteRepositoryMemberResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteRepositoryMemberResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteRepositoryMemberResponseBodyResult setNotificationLevel(Integer notificationLevel) {
            this.notificationLevel = notificationLevel;
            return this;
        }
        public Integer getNotificationLevel() {
            return this.notificationLevel;
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

        public DeleteRepositoryMemberResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
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
