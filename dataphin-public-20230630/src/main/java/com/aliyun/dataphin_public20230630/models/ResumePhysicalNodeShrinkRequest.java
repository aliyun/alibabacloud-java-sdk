// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ResumePhysicalNodeShrinkRequest extends TeaModel {
    /**
     * <p>The environment identifier. Valid values:</p>
     * <ul>
     * <li>DEV: development environment </li>
     * <li>PROD: production environment. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

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
     * <p>The request to resume scheduling.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResumeCommand")
    public String resumeCommandShrink;

    public static ResumePhysicalNodeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumePhysicalNodeShrinkRequest self = new ResumePhysicalNodeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ResumePhysicalNodeShrinkRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ResumePhysicalNodeShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ResumePhysicalNodeShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public ResumePhysicalNodeShrinkRequest setResumeCommandShrink(String resumeCommandShrink) {
        this.resumeCommandShrink = resumeCommandShrink;
        return this;
    }
    public String getResumeCommandShrink() {
        return this.resumeCommandShrink;
    }

}
