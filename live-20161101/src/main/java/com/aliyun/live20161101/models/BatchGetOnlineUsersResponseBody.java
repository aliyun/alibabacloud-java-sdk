// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class BatchGetOnlineUsersResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Result")
    public BatchGetOnlineUsersResponseBodyResult result;

    public static BatchGetOnlineUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetOnlineUsersResponseBody self = new BatchGetOnlineUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetOnlineUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetOnlineUsersResponseBody setResult(BatchGetOnlineUsersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public BatchGetOnlineUsersResponseBodyResult getResult() {
        return this.result;
    }

    public static class BatchGetOnlineUsersResponseBodyResultOnlineUsers extends TeaModel {
        /**
         * <p>The time when the user joined the group. The value is a UTC timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("JoinTime")
        public Long joinTime;

        /**
         * <p>Indicates whether the user is online. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>de1**a0</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static BatchGetOnlineUsersResponseBodyResultOnlineUsers build(java.util.Map<String, ?> map) throws Exception {
            BatchGetOnlineUsersResponseBodyResultOnlineUsers self = new BatchGetOnlineUsersResponseBodyResultOnlineUsers();
            return TeaModel.build(map, self);
        }

        public BatchGetOnlineUsersResponseBodyResultOnlineUsers setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public BatchGetOnlineUsersResponseBodyResultOnlineUsers setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public BatchGetOnlineUsersResponseBodyResultOnlineUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class BatchGetOnlineUsersResponseBodyResult extends TeaModel {
        /**
         * <p>The information about users.</p>
         */
        @NameInMap("OnlineUsers")
        public java.util.List<BatchGetOnlineUsersResponseBodyResultOnlineUsers> onlineUsers;

        public static BatchGetOnlineUsersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            BatchGetOnlineUsersResponseBodyResult self = new BatchGetOnlineUsersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public BatchGetOnlineUsersResponseBodyResult setOnlineUsers(java.util.List<BatchGetOnlineUsersResponseBodyResultOnlineUsers> onlineUsers) {
            this.onlineUsers = onlineUsers;
            return this;
        }
        public java.util.List<BatchGetOnlineUsersResponseBodyResultOnlineUsers> getOnlineUsers() {
            return this.onlineUsers;
        }

    }

}
