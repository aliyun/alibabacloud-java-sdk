// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitAssetsOffShelveShrinkRequest extends TeaModel {
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
     * <p>The delisting submit command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubmitCommand")
    public String submitCommandShrink;

    public static SubmitAssetsOffShelveShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAssetsOffShelveShrinkRequest self = new SubmitAssetsOffShelveShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAssetsOffShelveShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SubmitAssetsOffShelveShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public SubmitAssetsOffShelveShrinkRequest setSubmitCommandShrink(String submitCommandShrink) {
        this.submitCommandShrink = submitCommandShrink;
        return this;
    }
    public String getSubmitCommandShrink() {
        return this.submitCommandShrink;
    }

}
