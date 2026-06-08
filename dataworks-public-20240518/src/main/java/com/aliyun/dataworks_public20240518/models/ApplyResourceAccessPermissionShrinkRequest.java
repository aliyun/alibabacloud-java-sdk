// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ApplyResourceAccessPermissionShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplyContents")
    public String applyContentsShrink;

    /**
     * <strong>example:</strong>
     * <p>ABFUOEUOTRTRJKE</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Reason")
    public String reason;

    public static ApplyResourceAccessPermissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyResourceAccessPermissionShrinkRequest self = new ApplyResourceAccessPermissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ApplyResourceAccessPermissionShrinkRequest setApplyContentsShrink(String applyContentsShrink) {
        this.applyContentsShrink = applyContentsShrink;
        return this;
    }
    public String getApplyContentsShrink() {
        return this.applyContentsShrink;
    }

    public ApplyResourceAccessPermissionShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ApplyResourceAccessPermissionShrinkRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
