// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAuthorizedUsersForInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Users")
    public java.util.List<ListAuthorizedUsersForInstanceResponseBodyUsers> users;

    public static ListAuthorizedUsersForInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedUsersForInstanceResponseBody self = new ListAuthorizedUsersForInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedUsersForInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizedUsersForInstanceResponseBody setUsers(java.util.List<ListAuthorizedUsersForInstanceResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListAuthorizedUsersForInstanceResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListAuthorizedUsersForInstanceResponseBodyUsers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>164882191****</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <strong>example:</strong>
         * <p>51***</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>user_test</p>
         */
        @NameInMap("UserNickName")
        public String userNickName;

        /**
         * <strong>example:</strong>
         * <p>user01</p>
         */
        @NameInMap("UserRealName")
        public String userRealName;

        public static ListAuthorizedUsersForInstanceResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedUsersForInstanceResponseBodyUsers self = new ListAuthorizedUsersForInstanceResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedUsersForInstanceResponseBodyUsers setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListAuthorizedUsersForInstanceResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListAuthorizedUsersForInstanceResponseBodyUsers setUserNickName(String userNickName) {
            this.userNickName = userNickName;
            return this;
        }
        public String getUserNickName() {
            return this.userNickName;
        }

        public ListAuthorizedUsersForInstanceResponseBodyUsers setUserRealName(String userRealName) {
            this.userRealName = userRealName;
            return this;
        }
        public String getUserRealName() {
            return this.userRealName;
        }

    }

}
