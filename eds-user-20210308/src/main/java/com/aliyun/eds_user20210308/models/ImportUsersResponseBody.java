// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ImportUsersResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreateResult")
    public ImportUsersResponseBodyCreateResult createResult;

    public static ImportUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportUsersResponseBody self = new ImportUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportUsersResponseBody setCreateResult(ImportUsersResponseBodyCreateResult createResult) {
        this.createResult = createResult;
        return this;
    }
    public ImportUsersResponseBodyCreateResult getCreateResult() {
        return this.createResult;
    }

    public static class ImportUsersResponseBodyCreateResultCreatedUsers extends TeaModel {
        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("Email")
        public String email;

        public static ImportUsersResponseBodyCreateResultCreatedUsers build(java.util.Map<String, ?> map) throws Exception {
            ImportUsersResponseBodyCreateResultCreatedUsers self = new ImportUsersResponseBodyCreateResultCreatedUsers();
            return TeaModel.build(map, self);
        }

        public ImportUsersResponseBodyCreateResultCreatedUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public ImportUsersResponseBodyCreateResultCreatedUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

    public static class ImportUsersResponseBodyCreateResultFailedUsers extends TeaModel {
        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("Email")
        public String email;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static ImportUsersResponseBodyCreateResultFailedUsers build(java.util.Map<String, ?> map) throws Exception {
            ImportUsersResponseBodyCreateResultFailedUsers self = new ImportUsersResponseBodyCreateResultFailedUsers();
            return TeaModel.build(map, self);
        }

        public ImportUsersResponseBodyCreateResultFailedUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public ImportUsersResponseBodyCreateResultFailedUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ImportUsersResponseBodyCreateResultFailedUsers setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ImportUsersResponseBodyCreateResultFailedUsers setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class ImportUsersResponseBodyCreateResult extends TeaModel {
        @NameInMap("CreatedUsers")
        public java.util.List<ImportUsersResponseBodyCreateResultCreatedUsers> createdUsers;

        @NameInMap("FailedUsers")
        public java.util.List<ImportUsersResponseBodyCreateResultFailedUsers> failedUsers;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Status")
        public String status;

        public static ImportUsersResponseBodyCreateResult build(java.util.Map<String, ?> map) throws Exception {
            ImportUsersResponseBodyCreateResult self = new ImportUsersResponseBodyCreateResult();
            return TeaModel.build(map, self);
        }

        public ImportUsersResponseBodyCreateResult setCreatedUsers(java.util.List<ImportUsersResponseBodyCreateResultCreatedUsers> createdUsers) {
            this.createdUsers = createdUsers;
            return this;
        }
        public java.util.List<ImportUsersResponseBodyCreateResultCreatedUsers> getCreatedUsers() {
            return this.createdUsers;
        }

        public ImportUsersResponseBodyCreateResult setFailedUsers(java.util.List<ImportUsersResponseBodyCreateResultFailedUsers> failedUsers) {
            this.failedUsers = failedUsers;
            return this;
        }
        public java.util.List<ImportUsersResponseBodyCreateResultFailedUsers> getFailedUsers() {
            return this.failedUsers;
        }

        public ImportUsersResponseBodyCreateResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ImportUsersResponseBodyCreateResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
