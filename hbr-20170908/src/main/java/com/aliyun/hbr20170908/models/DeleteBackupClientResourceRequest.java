// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteBackupClientResourceRequest extends TeaModel {
    /**
     * <p>The IDs of HBR clients. The value can be a JSON array that consists of up to 100 client IDs. Separate the IDs with commas (,).</p>
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
