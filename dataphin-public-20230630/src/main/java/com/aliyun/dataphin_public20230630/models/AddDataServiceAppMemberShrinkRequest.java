// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddDataServiceAppMemberShrinkRequest extends TeaModel {
    /**
     * <p>The command to add a regular member to a data service application.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddCommand")
    public String addCommandShrink;

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
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static AddDataServiceAppMemberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDataServiceAppMemberShrinkRequest self = new AddDataServiceAppMemberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddDataServiceAppMemberShrinkRequest setAddCommandShrink(String addCommandShrink) {
        this.addCommandShrink = addCommandShrink;
        return this;
    }
    public String getAddCommandShrink() {
        return this.addCommandShrink;
    }

    public AddDataServiceAppMemberShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public AddDataServiceAppMemberShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
