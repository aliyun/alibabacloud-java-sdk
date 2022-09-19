// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GrantProjectRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Users")
    public java.util.List<GrantProjectRequestUsers> users;

    public static GrantProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantProjectRequest self = new GrantProjectRequest();
        return TeaModel.build(map, self);
    }

    public GrantProjectRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GrantProjectRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public GrantProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GrantProjectRequest setUsers(java.util.List<GrantProjectRequestUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<GrantProjectRequestUsers> getUsers() {
        return this.users;
    }

    public static class GrantProjectRequestUsers extends TeaModel {
        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        public static GrantProjectRequestUsers build(java.util.Map<String, ?> map) throws Exception {
            GrantProjectRequestUsers self = new GrantProjectRequestUsers();
            return TeaModel.build(map, self);
        }

        public GrantProjectRequestUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GrantProjectRequestUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
