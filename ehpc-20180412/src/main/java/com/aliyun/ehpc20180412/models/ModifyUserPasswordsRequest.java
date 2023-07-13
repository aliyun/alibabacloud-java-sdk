// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyUserPasswordsRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the asynchronous mode for this request.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to obtain the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The information about the user.</p>
     */
    @NameInMap("User")
    public java.util.List<ModifyUserPasswordsRequestUser> user;

    public static ModifyUserPasswordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserPasswordsRequest self = new ModifyUserPasswordsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserPasswordsRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
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
        /**
         * <p>The name of the user N whose password you want to modify. Valid values of N: 1 to 100.</p>
         * <br>
         * <p>You can call the [ListUsers](~~188572~~) operation to query the users of the cluster.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The password of the Nth user. The password must be 8 to 30 characters in length and contain three of the following items:</p>
         * <br>
         * <p>*   Uppercase letter</p>
         * <p>*   Lowercase letter</p>
         * <p>*   Digit</p>
         * <p>*   Special character: `()~!@#$%^&*-_+=|{}[]:;\"/<>,.?/`</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         * <br>
         * <p>>  We recommend that you use HTTPS to call API operations to avoid password leaks.</p>
         */
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
