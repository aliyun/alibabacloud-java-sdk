// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OfflinePipelineShrinkRequest extends TeaModel {
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

}
