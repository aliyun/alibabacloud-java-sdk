// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreatePipelineShrinkRequest extends TeaModel {
    /**
     * <p>The request context information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public String contextShrink;

    /**
     * <p>The configuration for creating a pipeline or workflow node.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public String createCommandShrink;

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

    public static CreatePipelineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineShrinkRequest self = new CreatePipelineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineShrinkRequest setContextShrink(String contextShrink) {
        this.contextShrink = contextShrink;
        return this;
    }
    public String getContextShrink() {
        return this.contextShrink;
    }

    public CreatePipelineShrinkRequest setCreateCommandShrink(String createCommandShrink) {
        this.createCommandShrink = createCommandShrink;
        return this;
    }
    public String getCreateCommandShrink() {
        return this.createCommandShrink;
    }

    public CreatePipelineShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreatePipelineShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
