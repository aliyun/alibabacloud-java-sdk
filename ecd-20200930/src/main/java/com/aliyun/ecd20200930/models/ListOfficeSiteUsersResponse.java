// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListOfficeSiteUsersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("Users")
    @Validation(required = true)
    public java.util.List<ListOfficeSiteUsersResponseUsers> users;

    public static ListOfficeSiteUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOfficeSiteUsersResponse self = new ListOfficeSiteUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListOfficeSiteUsersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOfficeSiteUsersResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOfficeSiteUsersResponse setUsers(java.util.List<ListOfficeSiteUsersResponseUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListOfficeSiteUsersResponseUsers> getUsers() {
        return this.users;
    }

    public static class ListOfficeSiteUsersResponseUsers extends TeaModel {
        @NameInMap("EndUser")
        @Validation(required = true)
        public String endUser;

        public static ListOfficeSiteUsersResponseUsers build(java.util.Map<String, ?> map) throws Exception {
            ListOfficeSiteUsersResponseUsers self = new ListOfficeSiteUsersResponseUsers();
            return TeaModel.build(map, self);
        }

        public ListOfficeSiteUsersResponseUsers setEndUser(String endUser) {
            this.endUser = endUser;
            return this;
        }
        public String getEndUser() {
            return this.endUser;
        }

    }

}
