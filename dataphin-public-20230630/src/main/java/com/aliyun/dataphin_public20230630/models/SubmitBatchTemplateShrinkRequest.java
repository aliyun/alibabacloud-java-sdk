// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitBatchTemplateShrinkRequest extends TeaModel {
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
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The template submission instruction.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubmitCommand")
    public String submitCommandShrink;

    public static SubmitBatchTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchTemplateShrinkRequest self = new SubmitBatchTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitBatchTemplateShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SubmitBatchTemplateShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public SubmitBatchTemplateShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public SubmitBatchTemplateShrinkRequest setSubmitCommandShrink(String submitCommandShrink) {
        this.submitCommandShrink = submitCommandShrink;
        return this;
    }
    public String getSubmitCommandShrink() {
        return this.submitCommandShrink;
    }

}
