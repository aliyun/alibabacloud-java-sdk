// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ResetUserPasswordResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>32D05B39-E6EE-4D7A-9FD0-762A26859D0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of resetting the password of the convenience user.</p>
     */
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
        /**
         * <p>The ID of the convenience user whose password failed to be reset.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidUsername</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>test123 is an invalid username.</p>
         */
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
        /**
         * <p>The information about the convenience users whose passwords failed to be reset.</p>
         */
        @NameInMap("FailedUsers")
        public java.util.List<ResetUserPasswordResponseBodyResetUsersResultFailedUsers> failedUsers;

        /**
         * <p>The convenience users to which the system sent a password reset email.</p>
         */
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
