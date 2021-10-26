// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddUsersRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("User")
    public java.util.List<AddUsersRequestUser> user;

    public static AddUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUsersRequest self = new AddUsersRequest();
        return TeaModel.build(map, self);
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
        @NameInMap("Group")
        public String group;

        @NameInMap("Name")
        public String name;

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
