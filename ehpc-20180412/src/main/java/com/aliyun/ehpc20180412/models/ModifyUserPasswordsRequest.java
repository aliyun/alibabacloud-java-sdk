// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyUserPasswordsRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the asynchronous mode for this request.</p>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to obtain the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The users. You can specify 1 to 100 users.</p>
     * <p>This parameter is required.</p>
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
         * <p>The username of the user whose password you want to change.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/188572.html">ListUsers</a> operation to query the usernames in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The new password for the user. The password must be 8 to 30 characters in length and contain at least three of the following character types:</p>
         * <ul>
         * <li>Uppercase letter</li>
         * <li>Lowercase letter</li>
         * <li>Digit</li>
         * <li>Special character: <code>()~!@#$%^&amp;*-_+=|{}[]:;\\&quot;/&lt;&gt;,.?/</code></li>
         * </ul>
         * <blockquote>
         * <p> We recommend that you use HTTPS to call this operation to avoid password leaks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1@a****</p>
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
