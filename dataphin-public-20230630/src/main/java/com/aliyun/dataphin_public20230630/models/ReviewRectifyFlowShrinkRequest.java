// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ReviewRectifyFlowShrinkRequest extends TeaModel {
    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The business request parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReviewCommand")
    public String reviewCommandShrink;

    public static ReviewRectifyFlowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReviewRectifyFlowShrinkRequest self = new ReviewRectifyFlowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReviewRectifyFlowShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ReviewRectifyFlowShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public ReviewRectifyFlowShrinkRequest setReviewCommandShrink(String reviewCommandShrink) {
        this.reviewCommandShrink = reviewCommandShrink;
        return this;
    }
    public String getReviewCommandShrink() {
        return this.reviewCommandShrink;
    }

}
