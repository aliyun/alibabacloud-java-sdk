// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OfflinePipelineByAsyncShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public String contextShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OfflineCommand")
    public String offlineCommandShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static OfflinePipelineByAsyncShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflinePipelineByAsyncShrinkRequest self = new OfflinePipelineByAsyncShrinkRequest();
        return TeaModel.build(map, self);
    }

    public OfflinePipelineByAsyncShrinkRequest setContextShrink(String contextShrink) {
        this.contextShrink = contextShrink;
        return this;
    }
    public String getContextShrink() {
        return this.contextShrink;
    }

    public OfflinePipelineByAsyncShrinkRequest setOfflineCommandShrink(String offlineCommandShrink) {
        this.offlineCommandShrink = offlineCommandShrink;
        return this;
    }
    public String getOfflineCommandShrink() {
        return this.offlineCommandShrink;
    }

    public OfflinePipelineByAsyncShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
