// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyUserGroupsRequest extends TeaModel {
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
    public java.util.List<ModifyUserGroupsRequestUser> user;

    public static ModifyUserGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserGroupsRequest self = new ModifyUserGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserGroupsRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public ModifyUserGroupsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyUserGroupsRequest setUser(java.util.List<ModifyUserGroupsRequestUser> user) {
        this.user = user;
        return this;
    }
    public java.util.List<ModifyUserGroupsRequestUser> getUser() {
        return this.user;
    }

    public static class ModifyUserGroupsRequestUser extends TeaModel {
        /**
         * <p>The new permission group of the user N. Valid values:</p>
         * <br>
         * <p>*   users: an ordinary permission group. It is applicable to ordinary users that need only to submit and debug jobs.</p>
         * <p>*   wheel: a sudo permission group. It is applicable to the administrator who needs to manage the cluster. In addition to submitting and debugging jobs, users who have sudo permissions can run sudo commands to install software and restart nodes.</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The name of the user N whose permissions you want to modify. Valid values of N: 1 to 100.</p>
         * <br>
         * <p>You can call the [ListUsers](~~188572~~) operation to query the users of the cluster.</p>
         */
        @NameInMap("Name")
        public String name;

        public static ModifyUserGroupsRequestUser build(java.util.Map<String, ?> map) throws Exception {
            ModifyUserGroupsRequestUser self = new ModifyUserGroupsRequestUser();
            return TeaModel.build(map, self);
        }

        public ModifyUserGroupsRequestUser setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ModifyUserGroupsRequestUser setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
