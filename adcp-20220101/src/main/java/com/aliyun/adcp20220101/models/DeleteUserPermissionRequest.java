// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeleteUserPermissionRequest extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the RAM user.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DeleteUserPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserPermissionRequest self = new DeleteUserPermissionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserPermissionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteUserPermissionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
