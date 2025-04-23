// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddUsersRequest extends TeaModel {
    /**
     * <p>Specifies whether to use asynchronous message links to add the users.</p>
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
    public java.util.List<AddUsersRequestUser> user;

    public static AddUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUsersRequest self = new AddUsersRequest();
        return TeaModel.build(map, self);
    }

    public AddUsersRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public AddUsersRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddUsersRequest setUser(java.util.List<AddUsersRequestUser> user) {
        this.user = user;
        return this;
    }
    public java.util.List<AddUsersRequestUser> getUser() {
        return this.user;
    }

    public static class AddUsersRequestUser extends TeaModel {
        /**
         * <p>The permission group of the new user. Valid values:</p>
         * <ul>
         * <li>users: ordinary permissions, which are suitable for ordinary users that need only to submit and debug jobs.</li>
         * <li>wheel: sudo permissions, which are suitable for administrators who need to manage clusters. In addition to submitting and debugging jobs, you can also run sudo commands to install software and restart nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>users</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The username of the new user. The username must be 6 to 30 characters in length, and can contain letters, digits and periods (.). The username must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The password of the new user. The password must be 8 to 30 characters in length and must contain at least three of the following character types:</p>
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
         * <p>1@a2****</p>
         */
        @NameInMap("Password")
        public String password;

        public static AddUsersRequestUser build(java.util.Map<String, ?> map) throws Exception {
            AddUsersRequestUser self = new AddUsersRequestUser();
            return TeaModel.build(map, self);
        }

        public AddUsersRequestUser setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public AddUsersRequestUser setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddUsersRequestUser setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

    }

}
