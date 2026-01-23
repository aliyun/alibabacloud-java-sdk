// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteSecurityIdentifyResultsShrinkRequest extends TeaModel {
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

    public static DeleteSecurityIdentifyResultsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityIdentifyResultsShrinkRequest self = new DeleteSecurityIdentifyResultsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityIdentifyResultsShrinkRequest setDeleteCommandShrink(String deleteCommandShrink) {
        this.deleteCommandShrink = deleteCommandShrink;
        return this;
    }
    public String getDeleteCommandShrink() {
        return this.deleteCommandShrink;
    }

    public DeleteSecurityIdentifyResultsShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
