// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class DeleteUsersShrinkRequest extends TeaModel {
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
    public String userShrink;

    public static DeleteUsersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUsersShrinkRequest self = new DeleteUsersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUsersShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteUsersShrinkRequest setUserShrink(String userShrink) {
        this.userShrink = userShrink;
        return this;
    }
    public String getUserShrink() {
        return this.userShrink;
    }

}
