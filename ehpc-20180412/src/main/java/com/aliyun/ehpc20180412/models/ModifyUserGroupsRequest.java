// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyUserGroupsRequest extends TeaModel {
    /**
     * <p>Specifies whether to use asynchronous message links to change the user group.</p>
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
         * <p>The user group to be changed. Valid values:</p>
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
         * <p>The username.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/188572.html">ListUsers</a> operation to query the usernames in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>user11</p>
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
