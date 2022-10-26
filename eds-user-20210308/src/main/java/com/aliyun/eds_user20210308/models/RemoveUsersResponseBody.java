// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class RemoveUsersResponseBody extends TeaModel {
    @NameInMap("RemoveUsersResult")
    public RemoveUsersResponseBodyRemoveUsersResult removeUsersResult;

    @NameInMap("RequestId")
    public String requestId;

    public static RemoveUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveUsersResponseBody self = new RemoveUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveUsersResponseBody setRemoveUsersResult(RemoveUsersResponseBodyRemoveUsersResult removeUsersResult) {
        this.removeUsersResult = removeUsersResult;
        return this;
    }
    public RemoveUsersResponseBodyRemoveUsersResult getRemoveUsersResult() {
        return this.removeUsersResult;
    }

    public RemoveUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RemoveUsersResponseBodyRemoveUsersResultFailedUsers extends TeaModel {
        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static RemoveUsersResponseBodyRemoveUsersResultFailedUsers build(java.util.Map<String, ?> map) throws Exception {
            RemoveUsersResponseBodyRemoveUsersResultFailedUsers self = new RemoveUsersResponseBodyRemoveUsersResultFailedUsers();
            return TeaModel.build(map, self);
        }

        public RemoveUsersResponseBodyRemoveUsersResultFailedUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public RemoveUsersResponseBodyRemoveUsersResultFailedUsers setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RemoveUsersResponseBodyRemoveUsersResultFailedUsers setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class RemoveUsersResponseBodyRemoveUsersResult extends TeaModel {
        @NameInMap("FailedUsers")
        public java.util.List<RemoveUsersResponseBodyRemoveUsersResultFailedUsers> failedUsers;

        @NameInMap("RemovedUsers")
        public java.util.List<String> removedUsers;

        public static RemoveUsersResponseBodyRemoveUsersResult build(java.util.Map<String, ?> map) throws Exception {
            RemoveUsersResponseBodyRemoveUsersResult self = new RemoveUsersResponseBodyRemoveUsersResult();
            return TeaModel.build(map, self);
        }

        public RemoveUsersResponseBodyRemoveUsersResult setFailedUsers(java.util.List<RemoveUsersResponseBodyRemoveUsersResultFailedUsers> failedUsers) {
            this.failedUsers = failedUsers;
            return this;
        }
        public java.util.List<RemoveUsersResponseBodyRemoveUsersResultFailedUsers> getFailedUsers() {
            return this.failedUsers;
        }

        public RemoveUsersResponseBodyRemoveUsersResult setRemovedUsers(java.util.List<String> removedUsers) {
            this.removedUsers = removedUsers;
            return this;
        }
        public java.util.List<String> getRemovedUsers() {
            return this.removedUsers;
        }

    }

}
