// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddZooKeeperSaslUserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-st21ri2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Reload")
    public Boolean reload;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SaslUser")
    public java.util.List<AddZooKeeperSaslUserRequestSaslUser> saslUser;

    public static AddZooKeeperSaslUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddZooKeeperSaslUserRequest self = new AddZooKeeperSaslUserRequest();
        return TeaModel.build(map, self);
    }

    public AddZooKeeperSaslUserRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddZooKeeperSaslUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddZooKeeperSaslUserRequest setReload(Boolean reload) {
        this.reload = reload;
        return this;
    }
    public Boolean getReload() {
        return this.reload;
    }

    public AddZooKeeperSaslUserRequest setSaslUser(java.util.List<AddZooKeeperSaslUserRequestSaslUser> saslUser) {
        this.saslUser = saslUser;
        return this;
    }
    public java.util.List<AddZooKeeperSaslUserRequestSaslUser> getSaslUser() {
        return this.saslUser;
    }

    public static class AddZooKeeperSaslUserRequestSaslUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>traaqwrasdf</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static AddZooKeeperSaslUserRequestSaslUser build(java.util.Map<String, ?> map) throws Exception {
            AddZooKeeperSaslUserRequestSaslUser self = new AddZooKeeperSaslUserRequestSaslUser();
            return TeaModel.build(map, self);
        }

        public AddZooKeeperSaslUserRequestSaslUser setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddZooKeeperSaslUserRequestSaslUser setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public AddZooKeeperSaslUserRequestSaslUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
