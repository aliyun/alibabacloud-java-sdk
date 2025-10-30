// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdatePipelineShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public String contextShrink;

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
    @NameInMap("UpdateCommand")
    public String updateCommandShrink;

    public static UpdatePipelineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineShrinkRequest self = new UpdatePipelineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineShrinkRequest setContextShrink(String contextShrink) {
        this.contextShrink = contextShrink;
        return this;
    }
    public String getContextShrink() {
        return this.contextShrink;
    }

    public UpdatePipelineShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdatePipelineShrinkRequest setUpdateCommandShrink(String updateCommandShrink) {
        this.updateCommandShrink = updateCommandShrink;
        return this;
    }
    public String getUpdateCommandShrink() {
        return this.updateCommandShrink;
    }

}
