// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class CreateUsersRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The list of users.</p>
     */
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
         * <p>The public key of the Nth user to add.</p>
         * <p>Valid values of N: 1 to 20.</p>
         * <p>This parameter is mutually exclusive with the Password parameter. This parameter takes effect when the cluster authentication method is set to key (not recommended).</p>
         * 
         * <strong>example:</strong>
         * <p>Abc****</p>
         */
        @NameInMap("AuthKey")
        public String authKey;

        /**
         * <p>The user group of the Nth user to add. Valid values:</p>
         * <ul>
         * <li>users: ordinary permission group. This group is suitable for regular users who only need to commit and debug jobs.</li>
         * <li>wheel: sudo permission group. This group is suitable for administrators who need to perform cluster management. In addition to committing and debugging jobs, users in this group can execute sudo commands to install software, restart nodes, and perform other operations.</li>
         * </ul>
         * <p>Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>users</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The password of the Nth user to add. The password must be 8 to 30 characters in length and contain at least three of the following four character types:</p>
         * <ul>
         * <li>Uppercase letters</li>
         * <li>Lowercase letters</li>
         * <li>Digits</li>
         * <li>Special characters: ()~!@#$%^&amp;*-_+=|{}[]:;\&quot;/&lt;&gt;,.?/</li>
         * </ul>
         * <p>Valid values of N: 1 to 20.</p>
         * <p>This parameter is mutually exclusive with the AuthKey parameter. This parameter takes effect when the cluster authentication method is set to password (recommended).</p>
         * 
         * <strong>example:</strong>
         * <p>1@a2****</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The username of the Nth user to add. The username must be 1 to 30 characters in length, start with a letter, and can contain digits and special characters (.).</p>
         * <p>Valid values of N: 1 to 20.</p>
         * 
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
