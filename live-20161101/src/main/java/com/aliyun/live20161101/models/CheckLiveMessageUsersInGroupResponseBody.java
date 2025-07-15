// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CheckLiveMessageUsersInGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F1F68D81-1543-1FE4-B56E-82200DD2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of users queried.</p>
     */
    @NameInMap("Users")
    public java.util.List<CheckLiveMessageUsersInGroupResponseBodyUsers> users;

    public static CheckLiveMessageUsersInGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLiveMessageUsersInGroupResponseBody self = new CheckLiveMessageUsersInGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLiveMessageUsersInGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLiveMessageUsersInGroupResponseBody setUsers(java.util.List<CheckLiveMessageUsersInGroupResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<CheckLiveMessageUsersInGroupResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class CheckLiveMessageUsersInGroupResponseBodyUsers extends TeaModel {
        /**
         * <p>Indicates whether the user is in the group.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>uid1</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static CheckLiveMessageUsersInGroupResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            CheckLiveMessageUsersInGroupResponseBodyUsers self = new CheckLiveMessageUsersInGroupResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public CheckLiveMessageUsersInGroupResponseBodyUsers setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public CheckLiveMessageUsersInGroupResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
