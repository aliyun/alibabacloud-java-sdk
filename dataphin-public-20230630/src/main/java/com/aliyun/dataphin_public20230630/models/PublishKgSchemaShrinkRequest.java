// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class PublishKgSchemaShrinkRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The publish command and its details.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PublishCommand")
    public String publishCommandShrink;

    /**
     * <p>The model ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static PublishKgSchemaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishKgSchemaShrinkRequest self = new PublishKgSchemaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PublishKgSchemaShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public PublishKgSchemaShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public PublishKgSchemaShrinkRequest setPublishCommandShrink(String publishCommandShrink) {
        this.publishCommandShrink = publishCommandShrink;
        return this;
    }
    public String getPublishCommandShrink() {
        return this.publishCommandShrink;
    }

    public PublishKgSchemaShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
