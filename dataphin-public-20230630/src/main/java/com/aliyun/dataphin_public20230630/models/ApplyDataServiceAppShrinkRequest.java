// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ApplyDataServiceAppShrinkRequest extends TeaModel {
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

    public static ApplyDataServiceAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDataServiceAppShrinkRequest self = new ApplyDataServiceAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDataServiceAppShrinkRequest setApplyCommandShrink(String applyCommandShrink) {
        this.applyCommandShrink = applyCommandShrink;
        return this;
    }
    public String getApplyCommandShrink() {
        return this.applyCommandShrink;
    }

    public ApplyDataServiceAppShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ApplyDataServiceAppShrinkRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

}
