// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitBatchTaskShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubmitCommand")
    public String submitCommandShrink;

    public static SubmitBatchTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchTaskShrinkRequest self = new SubmitBatchTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitBatchTaskShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SubmitBatchTaskShrinkRequest setSubmitCommandShrink(String submitCommandShrink) {
        this.submitCommandShrink = submitCommandShrink;
        return this;
    }
    public String getSubmitCommandShrink() {
        return this.submitCommandShrink;
    }

}
