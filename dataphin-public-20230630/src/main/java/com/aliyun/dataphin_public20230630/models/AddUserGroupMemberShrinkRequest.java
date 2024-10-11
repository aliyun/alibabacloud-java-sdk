// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddUserGroupMemberShrinkRequest extends TeaModel {
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

    public static AddUserGroupMemberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserGroupMemberShrinkRequest self = new AddUserGroupMemberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddUserGroupMemberShrinkRequest setAddCommandShrink(String addCommandShrink) {
        this.addCommandShrink = addCommandShrink;
        return this;
    }
    public String getAddCommandShrink() {
        return this.addCommandShrink;
    }

    public AddUserGroupMemberShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
