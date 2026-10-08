// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class StartPipelineIntegratedTaskShrinkRequest extends TeaModel {
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
     * <p>30110121</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartCommand")
    public String startCommandShrink;

    public static StartPipelineIntegratedTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartPipelineIntegratedTaskShrinkRequest self = new StartPipelineIntegratedTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartPipelineIntegratedTaskShrinkRequest setContextShrink(String contextShrink) {
        this.contextShrink = contextShrink;
        return this;
    }
    public String getContextShrink() {
        return this.contextShrink;
    }

    public StartPipelineIntegratedTaskShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public StartPipelineIntegratedTaskShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public StartPipelineIntegratedTaskShrinkRequest setStartCommandShrink(String startCommandShrink) {
        this.startCommandShrink = startCommandShrink;
        return this;
    }
    public String getStartCommandShrink() {
        return this.startCommandShrink;
    }

}
