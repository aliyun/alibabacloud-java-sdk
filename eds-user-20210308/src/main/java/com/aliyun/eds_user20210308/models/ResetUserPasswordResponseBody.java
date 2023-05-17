// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ResetUserPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResetUsersResult")
    public ResetUserPasswordResponseBodyResetUsersResult resetUsersResult;

    public static ResetUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetUserPasswordResponseBody self = new ResetUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetUserPasswordResponseBody setResetUsersResult(ResetUserPasswordResponseBodyResetUsersResult resetUsersResult) {
        this.resetUsersResult = resetUsersResult;
        return this;
    }
    public ResetUserPasswordResponseBodyResetUsersResult getResetUsersResult() {
        return this.resetUsersResult;
    }

    public static class ResetUserPasswordResponseBodyResetUsersResultFailedUsers extends TeaModel {
        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static ResetUserPasswordResponseBodyResetUsersResultFailedUsers build(java.util.Map<String, ?> map) throws Exception {
            ResetUserPasswordResponseBodyResetUsersResultFailedUsers self = new ResetUserPasswordResponseBodyResetUsersResultFailedUsers();
            return TeaModel.build(map, self);
        }

        public ResetUserPasswordResponseBodyResetUsersResultFailedUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public ResetUserPasswordResponseBodyResetUsersResultFailedUsers setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ResetUserPasswordResponseBodyResetUsersResultFailedUsers setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class ResetUserPasswordResponseBodyResetUsersResult extends TeaModel {
        @NameInMap("FailedUsers")
        public java.util.List<ResetUserPasswordResponseBodyResetUsersResultFailedUsers> failedUsers;

        @NameInMap("ResetUsers")
        public java.util.List<String> resetUsers;

        public static ResetUserPasswordResponseBodyResetUsersResult build(java.util.Map<String, ?> map) throws Exception {
            ResetUserPasswordResponseBodyResetUsersResult self = new ResetUserPasswordResponseBodyResetUsersResult();
            return TeaModel.build(map, self);
        }

        public ResetUserPasswordResponseBodyResetUsersResult setFailedUsers(java.util.List<ResetUserPasswordResponseBodyResetUsersResultFailedUsers> failedUsers) {
            this.failedUsers = failedUsers;
            return this;
        }
        public java.util.List<ResetUserPasswordResponseBodyResetUsersResultFailedUsers> getFailedUsers() {
            return this.failedUsers;
        }

        public ResetUserPasswordResponseBodyResetUsersResult setResetUsers(java.util.List<String> resetUsers) {
            this.resetUsers = resetUsers;
            return this;
        }
        public java.util.List<String> getResetUsers() {
            return this.resetUsers;
        }

    }

}
