// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class TransferOwnershipForAllObjectShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    @NameInMap("PrivilegeTransferRecord")
    public String privilegeTransferRecordShrink;

    public static TransferOwnershipForAllObjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferOwnershipForAllObjectShrinkRequest self = new TransferOwnershipForAllObjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TransferOwnershipForAllObjectShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public TransferOwnershipForAllObjectShrinkRequest setPrivilegeTransferRecordShrink(String privilegeTransferRecordShrink) {
        this.privilegeTransferRecordShrink = privilegeTransferRecordShrink;
        return this;
    }
    public String getPrivilegeTransferRecordShrink() {
        return this.privilegeTransferRecordShrink;
    }

}
