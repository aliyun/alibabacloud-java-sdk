// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ResumePhysicalNodeShrinkRequest extends TeaModel {
    /**
     * <p>Environment identifier.</p>
     * <ul>
     * <li>DEV: Development environment</li>
     * <li>PROD (default): Production environment</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>Tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>Resume scheduling request.</p>
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

    public ResumePhysicalNodeShrinkRequest setResumeCommandShrink(String resumeCommandShrink) {
        this.resumeCommandShrink = resumeCommandShrink;
        return this;
    }
    public String getResumeCommandShrink() {
        return this.resumeCommandShrink;
    }

}
