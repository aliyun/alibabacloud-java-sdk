// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecuteAdHocTaskShrinkRequest extends TeaModel {
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

    public static ExecuteAdHocTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAdHocTaskShrinkRequest self = new ExecuteAdHocTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteAdHocTaskShrinkRequest setExecuteCommandShrink(String executeCommandShrink) {
        this.executeCommandShrink = executeCommandShrink;
        return this;
    }
    public String getExecuteCommandShrink() {
        return this.executeCommandShrink;
    }

    public ExecuteAdHocTaskShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
