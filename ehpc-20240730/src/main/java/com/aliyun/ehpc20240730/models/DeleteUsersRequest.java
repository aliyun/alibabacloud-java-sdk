// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class DeleteUsersRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The users that you want to delete.</p>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>The name of user N that you want to delete.</p>
         * <p>Valid values of N: 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testuser</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DeleteUsersRequestUser build(java.util.Map<String, ?> map) throws Exception {
            DeleteUsersRequestUser self = new DeleteUsersRequestUser();
            return TeaModel.build(map, self);
        }

        public DeleteUsersRequestUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
