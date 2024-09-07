// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class CreateUsersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("User")
    public java.util.List<CreateUsersRequestUser> user;

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

    public CreateUsersRequest setUser(java.util.List<CreateUsersRequestUser> user) {
        this.user = user;
        return this;
    }
    public java.util.List<CreateUsersRequestUser> getUser() {
        return this.user;
    }

    public static class CreateUsersRequestUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Abc****</p>
         */
        @NameInMap("AuthKey")
        public String authKey;

        /**
         * <strong>example:</strong>
         * <p>users</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <strong>example:</strong>
         * <p>1@a2****</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>testuser</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static CreateUsersRequestUser build(java.util.Map<String, ?> map) throws Exception {
            CreateUsersRequestUser self = new CreateUsersRequestUser();
            return TeaModel.build(map, self);
        }

        public CreateUsersRequestUser setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

        public CreateUsersRequestUser setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public CreateUsersRequestUser setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateUsersRequestUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
