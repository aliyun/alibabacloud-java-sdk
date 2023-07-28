// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListUsersByRoleResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListUsersByRoleResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListUsersByRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersByRoleResponseBody self = new ListUsersByRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersByRoleResponseBody setData(ListUsersByRoleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUsersByRoleResponseBodyData getData() {
        return this.data;
    }

    public ListUsersByRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUsersByRoleResponseBodyDataUsers extends TeaModel {
        /**
         * <p>The name of the user.</p>
         */
        @NameInMap("name")
        public String name;

        public static ListUsersByRoleResponseBodyDataUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersByRoleResponseBodyDataUsers self = new ListUsersByRoleResponseBodyDataUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersByRoleResponseBodyDataUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListUsersByRoleResponseBodyData extends TeaModel {
        /**
         * <p>The users.</p>
         */
        @NameInMap("users")
        public java.util.List<ListUsersByRoleResponseBodyDataUsers> users;

        public static ListUsersByRoleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUsersByRoleResponseBodyData self = new ListUsersByRoleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUsersByRoleResponseBodyData setUsers(java.util.List<ListUsersByRoleResponseBodyDataUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<ListUsersByRoleResponseBodyDataUsers> getUsers() {
            return this.users;
        }

    }

}
