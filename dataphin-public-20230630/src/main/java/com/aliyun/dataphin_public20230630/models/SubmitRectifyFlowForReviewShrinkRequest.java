// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitRectifyFlowForReviewShrinkRequest extends TeaModel {
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
     * <p>The operator user ID.</p>
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
    @NameInMap("SubmitCommand")
    public String submitCommandShrink;

    public static SubmitRectifyFlowForReviewShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitRectifyFlowForReviewShrinkRequest self = new SubmitRectifyFlowForReviewShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitRectifyFlowForReviewShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SubmitRectifyFlowForReviewShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public SubmitRectifyFlowForReviewShrinkRequest setSubmitCommandShrink(String submitCommandShrink) {
        this.submitCommandShrink = submitCommandShrink;
        return this;
    }
    public String getSubmitCommandShrink() {
        return this.submitCommandShrink;
    }

}
