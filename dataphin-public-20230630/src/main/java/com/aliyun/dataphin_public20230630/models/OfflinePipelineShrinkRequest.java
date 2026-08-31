// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OfflinePipelineShrinkRequest extends TeaModel {
    /**
     * <p>The request context information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public String contextShrink;

    /**
     * <p>The offline command for the pipeline node.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OfflineCommand")
    public String offlineCommandShrink;

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

    public static OfflinePipelineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflinePipelineShrinkRequest self = new OfflinePipelineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public OfflinePipelineShrinkRequest setContextShrink(String contextShrink) {
        this.contextShrink = contextShrink;
        return this;
    }
    public String getContextShrink() {
        return this.contextShrink;
    }

    public OfflinePipelineShrinkRequest setOfflineCommandShrink(String offlineCommandShrink) {
        this.offlineCommandShrink = offlineCommandShrink;
        return this;
    }
    public String getOfflineCommandShrink() {
        return this.offlineCommandShrink;
    }

    public OfflinePipelineShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public OfflinePipelineShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
