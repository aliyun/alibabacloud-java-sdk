// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RemoveDataServiceAppMemberShrinkRequest extends TeaModel {
    /**
     * <p>Tenant ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>Remove regular members from a data service application</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RemoveCommand")
    public String removeCommandShrink;

    public static RemoveDataServiceAppMemberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataServiceAppMemberShrinkRequest self = new RemoveDataServiceAppMemberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDataServiceAppMemberShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public RemoveDataServiceAppMemberShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public RemoveDataServiceAppMemberShrinkRequest setRemoveCommandShrink(String removeCommandShrink) {
        this.removeCommandShrink = removeCommandShrink;
        return this;
    }
    public String getRemoveCommandShrink() {
        return this.removeCommandShrink;
    }

}
