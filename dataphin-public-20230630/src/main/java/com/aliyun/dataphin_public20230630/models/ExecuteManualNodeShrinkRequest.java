// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecuteManualNodeShrinkRequest extends TeaModel {
    /**
     * <p>The environment identifier. Valid values:</p>
     * <ul>
     * <li>DEV: Development environment. </li>
     * <li>PROD: Production environment. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The request to run a manual task.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExecuteCommand")
    public String executeCommandShrink;

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
     * <p>The operator ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

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

    public ExecuteManualNodeShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
