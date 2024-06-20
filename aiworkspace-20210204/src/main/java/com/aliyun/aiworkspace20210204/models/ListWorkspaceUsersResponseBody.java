// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListWorkspaceUsersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1e195c5116124202371861018d5bde</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Users")
    public java.util.List<ListWorkspaceUsersResponseBodyUsers> users;

    public static ListWorkspaceUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceUsersResponseBody self = new ListWorkspaceUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspaceUsersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListWorkspaceUsersResponseBody setUsers(java.util.List<ListWorkspaceUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListWorkspaceUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListWorkspaceUsersResponseBodyUsers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1611******3000</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>she******mo</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ListWorkspaceUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceUsersResponseBodyUsers self = new ListWorkspaceUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceUsersResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListWorkspaceUsersResponseBodyUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
