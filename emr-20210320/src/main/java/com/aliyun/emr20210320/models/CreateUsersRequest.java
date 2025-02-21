// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateUsersRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>区域ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>用户列表。</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Users")
    public java.util.List<Users> users;

    public static CreateUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUsersRequest self = new CreateUsersRequest();
        return TeaModel.build(map, self);
    }

    public CreateUsersRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateUsersRequest setUsers(java.util.List<Users> users) {
        this.users = users;
        return this;
    }
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static class Users extends TeaModel {
        /**
         * <p>用户密码。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>*Ab123</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>用户名。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xi</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static Users build(java.util.Map<String, ?> map) throws Exception {
            Users self = new Users();
            return TeaModel.build(map, self);
        }

        public Users setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public Users setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
