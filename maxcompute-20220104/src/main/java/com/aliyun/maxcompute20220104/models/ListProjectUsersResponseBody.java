// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListProjectUsersResponseBody extends TeaModel {
    @NameInMap("data")
    public ListProjectUsersResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    public static ListProjectUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectUsersResponseBody self = new ListProjectUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectUsersResponseBody setData(ListProjectUsersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProjectUsersResponseBodyData getData() {
        return this.data;
    }

    public ListProjectUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProjectUsersResponseBodyDataUsers extends TeaModel {
        @NameInMap("name")
        public String name;

        public static ListProjectUsersResponseBodyDataUsers build(java.util.Map<String, ?> map) throws Exception {
            ListProjectUsersResponseBodyDataUsers self = new ListProjectUsersResponseBodyDataUsers();
            return TeaModel.build(map, self);
        }

        public ListProjectUsersResponseBodyDataUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListProjectUsersResponseBodyData extends TeaModel {
        @NameInMap("users")
        public java.util.List<ListProjectUsersResponseBodyDataUsers> users;

        public static ListProjectUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectUsersResponseBodyData self = new ListProjectUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProjectUsersResponseBodyData setUsers(java.util.List<ListProjectUsersResponseBodyDataUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<ListProjectUsersResponseBodyDataUsers> getUsers() {
            return this.users;
        }

    }

}
