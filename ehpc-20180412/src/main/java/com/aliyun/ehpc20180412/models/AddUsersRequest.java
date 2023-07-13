// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddUsersRequest extends TeaModel {
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
         * <p>The permission group to which the user N belongs. Valid values:</p>
         * <br>
         * <p>*   users: an ordinary permission group. It is applicable to ordinary users that need only to submit and debug jobs.</p>
         * <p>*   wheel: a sudo permission group. It is applicable to the administrator who needs to manage the cluster. In addition to submitting and debugging jobs, users who have sudo permissions can run sudo commands to install software and restart nodes.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The name of the user that you want to add. The name must be 6 to 30 characters in length and can contain letters, digits, and periods (.). It must start with a letter.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
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
