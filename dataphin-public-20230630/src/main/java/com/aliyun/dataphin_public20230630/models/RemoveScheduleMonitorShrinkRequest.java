// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RemoveScheduleMonitorShrinkRequest extends TeaModel {
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
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The request body for removing scheduling monitoring.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RemoveCommand")
    public String removeCommandShrink;

    public static RemoveScheduleMonitorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveScheduleMonitorShrinkRequest self = new RemoveScheduleMonitorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveScheduleMonitorShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public RemoveScheduleMonitorShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public RemoveScheduleMonitorShrinkRequest setRemoveCommandShrink(String removeCommandShrink) {
        this.removeCommandShrink = removeCommandShrink;
        return this;
    }
    public String getRemoveCommandShrink() {
        return this.removeCommandShrink;
    }

}
