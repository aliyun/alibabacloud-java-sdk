// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddRegisterLineageShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddRegisterLineageCommand")
    public String addRegisterLineageCommandShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static AddRegisterLineageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRegisterLineageShrinkRequest self = new AddRegisterLineageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddRegisterLineageShrinkRequest setAddRegisterLineageCommandShrink(String addRegisterLineageCommandShrink) {
        this.addRegisterLineageCommandShrink = addRegisterLineageCommandShrink;
        return this;
    }
    public String getAddRegisterLineageCommandShrink() {
        return this.addRegisterLineageCommandShrink;
    }

    public AddRegisterLineageShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
