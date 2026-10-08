// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class StopPipelineIntegratedTaskShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public String contextShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <strong>example:</strong>
     * <p>30121101</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StopCommand")
    public String stopCommandShrink;

    public static StopPipelineIntegratedTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StopPipelineIntegratedTaskShrinkRequest self = new StopPipelineIntegratedTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StopPipelineIntegratedTaskShrinkRequest setContextShrink(String contextShrink) {
        this.contextShrink = contextShrink;
        return this;
    }
    public String getContextShrink() {
        return this.contextShrink;
    }

    public StopPipelineIntegratedTaskShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public StopPipelineIntegratedTaskShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public StopPipelineIntegratedTaskShrinkRequest setStopCommandShrink(String stopCommandShrink) {
        this.stopCommandShrink = stopCommandShrink;
        return this;
    }
    public String getStopCommandShrink() {
        return this.stopCommandShrink;
    }

}
