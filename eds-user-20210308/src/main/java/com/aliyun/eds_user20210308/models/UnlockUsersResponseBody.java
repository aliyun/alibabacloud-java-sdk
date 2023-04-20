// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UnlockUsersResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of unlocking the convenience user.</p>
     */
    @NameInMap("UnlockUsersResult")
    public UnlockUsersResponseBodyUnlockUsersResult unlockUsersResult;

    public static UnlockUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnlockUsersResponseBody self = new UnlockUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public UnlockUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnlockUsersResponseBody setUnlockUsersResult(UnlockUsersResponseBodyUnlockUsersResult unlockUsersResult) {
        this.unlockUsersResult = unlockUsersResult;
        return this;
    }
    public UnlockUsersResponseBodyUnlockUsersResult getUnlockUsersResult() {
        return this.unlockUsersResult;
    }

    public static class UnlockUsersResponseBodyUnlockUsersResultFailedUsers extends TeaModel {
        /**
         * <p>The ID of the convenience user that failed to be unlocked.</p>
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

        public static UnlockUsersResponseBodyUnlockUsersResultFailedUsers build(java.util.Map<String, ?> map) throws Exception {
            UnlockUsersResponseBodyUnlockUsersResultFailedUsers self = new UnlockUsersResponseBodyUnlockUsersResultFailedUsers();
            return TeaModel.build(map, self);
        }

        public UnlockUsersResponseBodyUnlockUsersResultFailedUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public UnlockUsersResponseBodyUnlockUsersResultFailedUsers setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public UnlockUsersResponseBodyUnlockUsersResultFailedUsers setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class UnlockUsersResponseBodyUnlockUsersResult extends TeaModel {
        /**
         * <p>The convenience users that failed to be unlocked.</p>
         */
        @NameInMap("FailedUsers")
        public java.util.List<UnlockUsersResponseBodyUnlockUsersResultFailedUsers> failedUsers;

        /**
         * <p>The convenience users that were unlocked.</p>
         */
        @NameInMap("UnlockedUsers")
        public java.util.List<String> unlockedUsers;

        public static UnlockUsersResponseBodyUnlockUsersResult build(java.util.Map<String, ?> map) throws Exception {
            UnlockUsersResponseBodyUnlockUsersResult self = new UnlockUsersResponseBodyUnlockUsersResult();
            return TeaModel.build(map, self);
        }

        public UnlockUsersResponseBodyUnlockUsersResult setFailedUsers(java.util.List<UnlockUsersResponseBodyUnlockUsersResultFailedUsers> failedUsers) {
            this.failedUsers = failedUsers;
            return this;
        }
        public java.util.List<UnlockUsersResponseBodyUnlockUsersResultFailedUsers> getFailedUsers() {
            return this.failedUsers;
        }

        public UnlockUsersResponseBodyUnlockUsersResult setUnlockedUsers(java.util.List<String> unlockedUsers) {
            this.unlockedUsers = unlockedUsers;
            return this;
        }
        public java.util.List<String> getUnlockedUsers() {
            return this.unlockedUsers;
        }

    }

}
