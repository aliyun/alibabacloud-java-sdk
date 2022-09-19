// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class RevokeProjectRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Users")
    public java.util.List<RevokeProjectRequestUsers> users;

    public static RevokeProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeProjectRequest self = new RevokeProjectRequest();
        return TeaModel.build(map, self);
    }

    public RevokeProjectRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public RevokeProjectRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public RevokeProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RevokeProjectRequest setUsers(java.util.List<RevokeProjectRequestUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<RevokeProjectRequestUsers> getUsers() {
        return this.users;
    }

    public static class RevokeProjectRequestUsers extends TeaModel {
        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        public static RevokeProjectRequestUsers build(java.util.Map<String, ?> map) throws Exception {
            RevokeProjectRequestUsers self = new RevokeProjectRequestUsers();
            return TeaModel.build(map, self);
        }

        public RevokeProjectRequestUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public RevokeProjectRequestUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
