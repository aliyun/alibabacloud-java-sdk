// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteBackupClientResourceRequest extends TeaModel {
    /**
     * <p>A list of client IDs. The list can contain up to 100 client IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;c-*********************&quot;]</p>
     */
    @NameInMap("ClientIds")
    public java.util.Map<String, ?> clientIds;

    public static DeleteBackupClientResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupClientResourceRequest self = new DeleteBackupClientResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBackupClientResourceRequest setClientIds(java.util.Map<String, ?> clientIds) {
        this.clientIds = clientIds;
        return this;
    }
    public java.util.Map<String, ?> getClientIds() {
        return this.clientIds;
    }

}
