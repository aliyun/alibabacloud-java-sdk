// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListAuthorizedUsersRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Users")
    public java.util.List<ListAuthorizedUsersRequestUsers> users;

    public static ListAuthorizedUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedUsersRequest self = new ListAuthorizedUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedUsersRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ListAuthorizedUsersRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public ListAuthorizedUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAuthorizedUsersRequest setUsers(java.util.List<ListAuthorizedUsersRequestUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListAuthorizedUsersRequestUsers> getUsers() {
        return this.users;
    }

    public static class ListAuthorizedUsersRequestUsers extends TeaModel {
        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        public static ListAuthorizedUsersRequestUsers build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedUsersRequestUsers self = new ListAuthorizedUsersRequestUsers();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedUsersRequestUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListAuthorizedUsersRequestUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
