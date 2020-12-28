// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteUsersRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("User")
    public java.util.List<DeleteUsersRequestUser> user;

    public static DeleteUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUsersRequest self = new DeleteUsersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUsersRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteUsersRequest setUser(java.util.List<DeleteUsersRequestUser> user) {
        this.user = user;
        return this;
    }
    public java.util.List<DeleteUsersRequestUser> getUser() {
        return this.user;
    }

    public static class DeleteUsersRequestUser extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static DeleteUsersRequestUser build(java.util.Map<String, ?> map) throws Exception {
            DeleteUsersRequestUser self = new DeleteUsersRequestUser();
            return TeaModel.build(map, self);
        }

        public DeleteUsersRequestUser setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
