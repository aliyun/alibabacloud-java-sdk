// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteSecurityClassifyShrinkRequest extends TeaModel {
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

    public static DeleteSecurityClassifyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityClassifyShrinkRequest self = new DeleteSecurityClassifyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityClassifyShrinkRequest setDeleteCommandShrink(String deleteCommandShrink) {
        this.deleteCommandShrink = deleteCommandShrink;
        return this;
    }
    public String getDeleteCommandShrink() {
        return this.deleteCommandShrink;
    }

    public DeleteSecurityClassifyShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
