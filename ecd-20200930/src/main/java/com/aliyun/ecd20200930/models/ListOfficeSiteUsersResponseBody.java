// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListOfficeSiteUsersResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Users")
    public java.util.List<ListOfficeSiteUsersResponseBodyUsers> users;

    public static ListOfficeSiteUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOfficeSiteUsersResponseBody self = new ListOfficeSiteUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOfficeSiteUsersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOfficeSiteUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOfficeSiteUsersResponseBody setUsers(java.util.List<ListOfficeSiteUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListOfficeSiteUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListOfficeSiteUsersResponseBodyUsers extends TeaModel {
        @NameInMap("EndUser")
        public String endUser;

        public static ListOfficeSiteUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListOfficeSiteUsersResponseBodyUsers self = new ListOfficeSiteUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListOfficeSiteUsersResponseBodyUsers setEndUser(String endUser) {
            this.endUser = endUser;
            return this;
        }
        public String getEndUser() {
            return this.endUser;
        }

    }

}
