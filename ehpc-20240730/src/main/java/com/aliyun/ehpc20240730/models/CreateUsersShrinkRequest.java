// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class CreateUsersShrinkRequest extends TeaModel {
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
     * <p>The users that you want to add.</p>
     */
    @NameInMap("User")
    public String userShrink;

    public static CreateUsersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUsersShrinkRequest self = new CreateUsersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateUsersShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateUsersShrinkRequest setUserShrink(String userShrink) {
        this.userShrink = userShrink;
        return this;
    }
    public String getUserShrink() {
        return this.userShrink;
    }

}
