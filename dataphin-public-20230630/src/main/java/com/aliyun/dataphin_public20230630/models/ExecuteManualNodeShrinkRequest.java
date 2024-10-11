// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecuteManualNodeShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExecuteCommand")
    public String executeCommandShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ExecuteManualNodeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteManualNodeShrinkRequest self = new ExecuteManualNodeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteManualNodeShrinkRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ExecuteManualNodeShrinkRequest setExecuteCommandShrink(String executeCommandShrink) {
        this.executeCommandShrink = executeCommandShrink;
        return this;
    }
    public String getExecuteCommandShrink() {
        return this.executeCommandShrink;
    }

    public ExecuteManualNodeShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
