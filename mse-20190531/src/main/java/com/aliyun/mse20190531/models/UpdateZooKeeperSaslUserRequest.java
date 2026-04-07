// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateZooKeeperSaslUserRequest extends TeaModel {
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
     * <p>mse_prepaid_public_cn-tl327w****</p>
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
    public java.util.List<UpdateZooKeeperSaslUserRequestSaslUser> saslUser;

    public static UpdateZooKeeperSaslUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateZooKeeperSaslUserRequest self = new UpdateZooKeeperSaslUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateZooKeeperSaslUserRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateZooKeeperSaslUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateZooKeeperSaslUserRequest setReload(Boolean reload) {
        this.reload = reload;
        return this;
    }
    public Boolean getReload() {
        return this.reload;
    }

    public UpdateZooKeeperSaslUserRequest setSaslUser(java.util.List<UpdateZooKeeperSaslUserRequestSaslUser> saslUser) {
        this.saslUser = saslUser;
        return this;
    }
    public java.util.List<UpdateZooKeeperSaslUserRequestSaslUser> getSaslUser() {
        return this.saslUser;
    }

    public static class UpdateZooKeeperSaslUserRequestSaslUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>origin-password</p>
         */
        @NameInMap("OriginPassword")
        public String originPassword;

        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static UpdateZooKeeperSaslUserRequestSaslUser build(java.util.Map<String, ?> map) throws Exception {
            UpdateZooKeeperSaslUserRequestSaslUser self = new UpdateZooKeeperSaslUserRequestSaslUser();
            return TeaModel.build(map, self);
        }

        public UpdateZooKeeperSaslUserRequestSaslUser setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateZooKeeperSaslUserRequestSaslUser setOriginPassword(String originPassword) {
            this.originPassword = originPassword;
            return this;
        }
        public String getOriginPassword() {
            return this.originPassword;
        }

        public UpdateZooKeeperSaslUserRequestSaslUser setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateZooKeeperSaslUserRequestSaslUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
