// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteBackupClientRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Backup client.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-*********************</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    public static DeleteBackupClientRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupClientRequest self = new DeleteBackupClientRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBackupClientRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

}
