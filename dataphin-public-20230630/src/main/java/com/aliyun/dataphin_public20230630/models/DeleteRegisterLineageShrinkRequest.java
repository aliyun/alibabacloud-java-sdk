// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteRegisterLineageShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteRegisterLineageCommand")
    public String deleteRegisterLineageCommandShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteRegisterLineageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRegisterLineageShrinkRequest self = new DeleteRegisterLineageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRegisterLineageShrinkRequest setDeleteRegisterLineageCommandShrink(String deleteRegisterLineageCommandShrink) {
        this.deleteRegisterLineageCommandShrink = deleteRegisterLineageCommandShrink;
        return this;
    }
    public String getDeleteRegisterLineageCommandShrink() {
        return this.deleteRegisterLineageCommandShrink;
    }

    public DeleteRegisterLineageShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
