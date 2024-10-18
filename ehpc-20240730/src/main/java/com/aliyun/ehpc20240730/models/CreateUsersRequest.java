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
     * <p>The users that you want to add.</p>
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
         * <p>The public key of the user.</p>
         * <p>You can add up to 20 users in a call.</p>
         * <p>Specify one of the Password and AuthKey parameters. The AuthKey parameter takes effect only when the cluster authentication method is set to Key. Key authentication is not recommended.</p>
         * 
         * <strong>example:</strong>
         * <p>Abc****</p>
         */
        @NameInMap("AuthKey")
        public String authKey;

        /**
         * <p>The permission group to which the user belongs. Valid values:</p>
         * <p>users: ordinary permissions, which are suitable for ordinary users that need only to submit and debug jobs. wheel: sudo permissions, which are suitable for administrators who need to manage clusters. In addition to submitting and debugging jobs, you can also run sudo commands to install software and restart nodes. You can add up to 20 users in a call.</p>
         * 
         * <strong>example:</strong>
         * <p>users</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The password of the user. The password must be 6 to 30 characters in length and must contain three of the following character types:</p>
         * <ul>
         * <li>Uppercase letters</li>
         * <li>Lowercase letters</li>
         * <li>Digits</li>
         * <li>Special characters ()~!@#$%^&amp;\*-_+=|{}[]:;\&quot;/&lt;&gt;,.?/</li>
         * </ul>
         * <p>You can add up to 20 users in a call.</p>
         * <p>Specify one of the Password and AuthKey parameters. The Password parameter takes effect only when the cluster authentication method is set to Password. Password authentication is recommended.</p>
         * 
         * <strong>example:</strong>
         * <p>1@a2****</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The username. The username must be 1 to 30 characters in length. It must start with a letter and can contain digits, letters, and periods (.).</p>
         * <p>You can add up to 20 users in a call.</p>
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
