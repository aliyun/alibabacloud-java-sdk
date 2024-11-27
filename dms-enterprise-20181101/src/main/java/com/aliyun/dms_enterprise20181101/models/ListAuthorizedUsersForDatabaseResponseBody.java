// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAuthorizedUsersForDatabaseResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FE8EE2F1-4880-46BC-A704-5CF63EAF9A04</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Users")
    public java.util.List<ListAuthorizedUsersForDatabaseResponseBodyUsers> users;

    public static ListAuthorizedUsersForDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedUsersForDatabaseResponseBody self = new ListAuthorizedUsersForDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedUsersForDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizedUsersForDatabaseResponseBody setUsers(java.util.List<ListAuthorizedUsersForDatabaseResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListAuthorizedUsersForDatabaseResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListAuthorizedUsersForDatabaseResponseBodyUsers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>164882191****</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <strong>example:</strong>
         * <p>51****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>user_test</p>
         */
        @NameInMap("UserNickName")
        public String userNickName;

        public static ListAuthorizedUsersForDatabaseResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedUsersForDatabaseResponseBodyUsers self = new ListAuthorizedUsersForDatabaseResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedUsersForDatabaseResponseBodyUsers setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListAuthorizedUsersForDatabaseResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListAuthorizedUsersForDatabaseResponseBodyUsers setUserNickName(String userNickName) {
            this.userNickName = userNickName;
            return this;
        }
        public String getUserNickName() {
            return this.userNickName;
        }

    }

}
