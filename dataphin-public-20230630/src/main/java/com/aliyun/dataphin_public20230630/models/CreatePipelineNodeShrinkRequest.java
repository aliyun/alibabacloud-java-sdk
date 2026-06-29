// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreatePipelineNodeShrinkRequest extends TeaModel {
    /**
     * <p>The command to create a pipeline. Both offline and real-time pipelines are supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreatePipelineNodeCommand")
    public String createPipelineNodeCommandShrink;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreatePipelineNodeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineNodeShrinkRequest self = new CreatePipelineNodeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineNodeShrinkRequest setCreatePipelineNodeCommandShrink(String createPipelineNodeCommandShrink) {
        this.createPipelineNodeCommandShrink = createPipelineNodeCommandShrink;
        return this;
    }
    public String getCreatePipelineNodeCommandShrink() {
        return this.createPipelineNodeCommandShrink;
    }

    public CreatePipelineNodeShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
