// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyUserGroupsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("User")
    public java.util.List<ModifyUserGroupsRequestUser> user;

    public static ModifyUserGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserGroupsRequest self = new ModifyUserGroupsRequest();
        return TeaModel.build(map, self);
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
        @NameInMap("Group")
        public String group;

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
