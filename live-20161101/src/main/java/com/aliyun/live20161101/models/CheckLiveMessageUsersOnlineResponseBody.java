// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CheckLiveMessageUsersOnlineResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>178F572F-AECF-100B-937A-B8047B4D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of users queried.</p>
     */
    @NameInMap("UserList")
    public java.util.List<CheckLiveMessageUsersOnlineResponseBodyUserList> userList;

    public static CheckLiveMessageUsersOnlineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLiveMessageUsersOnlineResponseBody self = new CheckLiveMessageUsersOnlineResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLiveMessageUsersOnlineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLiveMessageUsersOnlineResponseBody setUserList(java.util.List<CheckLiveMessageUsersOnlineResponseBodyUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<CheckLiveMessageUsersOnlineResponseBodyUserList> getUserList() {
        return this.userList;
    }

    public static class CheckLiveMessageUsersOnlineResponseBodyUserList extends TeaModel {
        /**
         * <p>Indicates whether the user is online.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>uid1</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static CheckLiveMessageUsersOnlineResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            CheckLiveMessageUsersOnlineResponseBodyUserList self = new CheckLiveMessageUsersOnlineResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public CheckLiveMessageUsersOnlineResponseBodyUserList setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public CheckLiveMessageUsersOnlineResponseBodyUserList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
