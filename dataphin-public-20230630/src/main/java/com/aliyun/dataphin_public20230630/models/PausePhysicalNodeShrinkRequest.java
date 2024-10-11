// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class PausePhysicalNodeShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

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
    @NameInMap("PauseCommand")
    public String pauseCommandShrink;

    public static PausePhysicalNodeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PausePhysicalNodeShrinkRequest self = new PausePhysicalNodeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PausePhysicalNodeShrinkRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public PausePhysicalNodeShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public PausePhysicalNodeShrinkRequest setPauseCommandShrink(String pauseCommandShrink) {
        this.pauseCommandShrink = pauseCommandShrink;
        return this;
    }
    public String getPauseCommandShrink() {
        return this.pauseCommandShrink;
    }

}
