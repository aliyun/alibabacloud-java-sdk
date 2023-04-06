// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersForApplicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Users")
    public java.util.List<ListUsersForApplicationResponseBodyUsers> users;

    public static ListUsersForApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForApplicationResponseBody self = new ListUsersForApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersForApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersForApplicationResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListUsersForApplicationResponseBody setUsers(java.util.List<ListUsersForApplicationResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListUsersForApplicationResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListUsersForApplicationResponseBodyUsers extends TeaModel {
        /**
         * <p>账户的唯一标识。</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListUsersForApplicationResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForApplicationResponseBodyUsers self = new ListUsersForApplicationResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersForApplicationResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
