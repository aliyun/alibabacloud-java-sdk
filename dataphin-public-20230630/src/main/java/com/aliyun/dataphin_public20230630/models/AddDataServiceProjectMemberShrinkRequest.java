// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddDataServiceProjectMemberShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddCommand")
    public String addCommandShrink;

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

    public static AddDataServiceProjectMemberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDataServiceProjectMemberShrinkRequest self = new AddDataServiceProjectMemberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddDataServiceProjectMemberShrinkRequest setAddCommandShrink(String addCommandShrink) {
        this.addCommandShrink = addCommandShrink;
        return this;
    }
    public String getAddCommandShrink() {
        return this.addCommandShrink;
    }

    public AddDataServiceProjectMemberShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public AddDataServiceProjectMemberShrinkRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

}
