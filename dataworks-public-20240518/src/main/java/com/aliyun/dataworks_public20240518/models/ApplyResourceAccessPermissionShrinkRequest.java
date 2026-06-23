// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ApplyResourceAccessPermissionShrinkRequest extends TeaModel {
    /**
     * <p>A list of permission requests.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplyContents")
    public String applyContentsShrink;

    /**
     * <p>The idempotency parameter, which prevents duplicate operations from repeated calls.</p>
     * 
     * <strong>example:</strong>
     * <p>ABFUOEUOTRTRJKE</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The reason for the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>业务发展需要</p>
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
