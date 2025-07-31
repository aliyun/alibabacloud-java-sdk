// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateProjectMemberShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>711833</p>
     */
    @NameInMap("Id")
    public Long id;

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
     */
    @NameInMap("UpdateCommand")
    public String updateCommandShrink;

    public static UpdateProjectMemberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectMemberShrinkRequest self = new UpdateProjectMemberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectMemberShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateProjectMemberShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateProjectMemberShrinkRequest setUpdateCommandShrink(String updateCommandShrink) {
        this.updateCommandShrink = updateCommandShrink;
        return this;
    }
    public String getUpdateCommandShrink() {
        return this.updateCommandShrink;
    }

}
