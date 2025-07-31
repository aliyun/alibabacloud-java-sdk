// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ApplyDataServiceApiShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplyCommand")
    public String applyCommandShrink;

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
     * 
     * <strong>example:</strong>
     * <p>102102</p>
     */
    @NameInMap("ProjectId")
    public Integer projectId;

    public static ApplyDataServiceApiShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDataServiceApiShrinkRequest self = new ApplyDataServiceApiShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDataServiceApiShrinkRequest setApplyCommandShrink(String applyCommandShrink) {
        this.applyCommandShrink = applyCommandShrink;
        return this;
    }
    public String getApplyCommandShrink() {
        return this.applyCommandShrink;
    }

    public ApplyDataServiceApiShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ApplyDataServiceApiShrinkRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

}
