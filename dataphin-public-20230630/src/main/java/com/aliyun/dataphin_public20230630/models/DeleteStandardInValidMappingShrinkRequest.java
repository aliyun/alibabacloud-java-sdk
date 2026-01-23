// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteStandardInValidMappingShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteCommand")
    public String deleteCommandShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteStandardInValidMappingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStandardInValidMappingShrinkRequest self = new DeleteStandardInValidMappingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStandardInValidMappingShrinkRequest setDeleteCommandShrink(String deleteCommandShrink) {
        this.deleteCommandShrink = deleteCommandShrink;
        return this;
    }
    public String getDeleteCommandShrink() {
        return this.deleteCommandShrink;
    }

    public DeleteStandardInValidMappingShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
