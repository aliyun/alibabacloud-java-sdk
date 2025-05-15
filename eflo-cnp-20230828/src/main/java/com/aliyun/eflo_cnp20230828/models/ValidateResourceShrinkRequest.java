// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class ValidateResourceShrinkRequest extends TeaModel {
    /**
     * <p>Resource ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-sh-ouypm5aucy</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>User Authorization Parameters</p>
     */
    @NameInMap("UserAccessParam")
    public String userAccessParamShrink;

    public static ValidateResourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateResourceShrinkRequest self = new ValidateResourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ValidateResourceShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ValidateResourceShrinkRequest setUserAccessParamShrink(String userAccessParamShrink) {
        this.userAccessParamShrink = userAccessParamShrink;
        return this;
    }
    public String getUserAccessParamShrink() {
        return this.userAccessParamShrink;
    }

}
