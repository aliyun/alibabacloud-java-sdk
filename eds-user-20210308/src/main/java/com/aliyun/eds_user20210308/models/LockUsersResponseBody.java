// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class LockUsersResponseBody extends TeaModel {
    /**
     * <p>The result of the locking the convenience user.</p>
     */
    @NameInMap("LockUsersResult")
    public LockUsersResponseBodyLockUsersResult lockUsersResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static LockUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LockUsersResponseBody self = new LockUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public LockUsersResponseBody setLockUsersResult(LockUsersResponseBodyLockUsersResult lockUsersResult) {
        this.lockUsersResult = lockUsersResult;
        return this;
    }
    public LockUsersResponseBodyLockUsersResult getLockUsersResult() {
        return this.lockUsersResult;
    }

    public LockUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class LockUsersResponseBodyLockUsersResultFailedUsers extends TeaModel {
        /**
         * <p>The ID of the convenience user that failed to be locked.</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The error code.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static LockUsersResponseBodyLockUsersResultFailedUsers build(java.util.Map<String, ?> map) throws Exception {
            LockUsersResponseBodyLockUsersResultFailedUsers self = new LockUsersResponseBodyLockUsersResultFailedUsers();
            return TeaModel.build(map, self);
        }

        public LockUsersResponseBodyLockUsersResultFailedUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public LockUsersResponseBodyLockUsersResultFailedUsers setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public LockUsersResponseBodyLockUsersResultFailedUsers setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class LockUsersResponseBodyLockUsersResult extends TeaModel {
        /**
         * <p>The convenience users that failed to be locked.</p>
         */
        @NameInMap("FailedUsers")
        public java.util.List<LockUsersResponseBodyLockUsersResultFailedUsers> failedUsers;

        /**
         * <p>The convenience users that were locked.</p>
         */
        @NameInMap("LockedUsers")
        public java.util.List<String> lockedUsers;

        public static LockUsersResponseBodyLockUsersResult build(java.util.Map<String, ?> map) throws Exception {
            LockUsersResponseBodyLockUsersResult self = new LockUsersResponseBodyLockUsersResult();
            return TeaModel.build(map, self);
        }

        public LockUsersResponseBodyLockUsersResult setFailedUsers(java.util.List<LockUsersResponseBodyLockUsersResultFailedUsers> failedUsers) {
            this.failedUsers = failedUsers;
            return this;
        }
        public java.util.List<LockUsersResponseBodyLockUsersResultFailedUsers> getFailedUsers() {
            return this.failedUsers;
        }

        public LockUsersResponseBodyLockUsersResult setLockedUsers(java.util.List<String> lockedUsers) {
            this.lockedUsers = lockedUsers;
            return this;
        }
        public java.util.List<String> getLockedUsers() {
            return this.lockedUsers;
        }

    }

}
