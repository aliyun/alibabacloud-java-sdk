// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20170714.models;

import com.aliyun.tea.*;

public class ModifyUserPasswordsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("User")
    public java.util.List<ModifyUserPasswordsRequestUser> user;

    public static ModifyUserPasswordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserPasswordsRequest self = new ModifyUserPasswordsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserPasswordsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyUserPasswordsRequest setUser(java.util.List<ModifyUserPasswordsRequestUser> user) {
        this.user = user;
        return this;
    }
    public java.util.List<ModifyUserPasswordsRequestUser> getUser() {
        return this.user;
    }

    public static class ModifyUserPasswordsRequestUser extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Password")
        public String password;

        public static ModifyUserPasswordsRequestUser build(java.util.Map<String, ?> map) throws Exception {
            ModifyUserPasswordsRequestUser self = new ModifyUserPasswordsRequestUser();
            return TeaModel.build(map, self);
        }

        public ModifyUserPasswordsRequestUser setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyUserPasswordsRequestUser setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

    }

}
