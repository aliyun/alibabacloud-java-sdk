// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddProjectMemberShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddCommand")
    public String addCommandShrink;

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

    public static AddProjectMemberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProjectMemberShrinkRequest self = new AddProjectMemberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddProjectMemberShrinkRequest setAddCommandShrink(String addCommandShrink) {
        this.addCommandShrink = addCommandShrink;
        return this;
    }
    public String getAddCommandShrink() {
        return this.addCommandShrink;
    }

    public AddProjectMemberShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AddProjectMemberShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
