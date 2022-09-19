// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListUnauthorizedUsersRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Users")
    public java.util.List<ListUnauthorizedUsersRequestUsers> users;

    public static ListUnauthorizedUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUnauthorizedUsersRequest self = new ListUnauthorizedUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListUnauthorizedUsersRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ListUnauthorizedUsersRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public ListUnauthorizedUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListUnauthorizedUsersRequest setUsers(java.util.List<ListUnauthorizedUsersRequestUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListUnauthorizedUsersRequestUsers> getUsers() {
        return this.users;
    }

    public static class ListUnauthorizedUsersRequestUsers extends TeaModel {
        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        public static ListUnauthorizedUsersRequestUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUnauthorizedUsersRequestUsers self = new ListUnauthorizedUsersRequestUsers();
            return TeaModel.build(map, self);
        }

        public ListUnauthorizedUsersRequestUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUnauthorizedUsersRequestUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
