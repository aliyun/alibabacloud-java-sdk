// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteUsersRequest extends TeaModel {
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
    public java.util.List<DeleteUsersRequestUser> user;

    public static DeleteUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUsersRequest self = new DeleteUsersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUsersRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
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
        /**
         * <p>The name of the user N that you want to delete. Valid values of N: 1 to 100.</p>
         * <br>
         * <p>You can call the [ListUsers](~~188572~~) operation to query the users of the cluster.</p>
         */
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
