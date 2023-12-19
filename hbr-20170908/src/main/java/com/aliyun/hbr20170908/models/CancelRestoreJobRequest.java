// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CancelRestoreJobRequest extends TeaModel {
    /**
     * <p>The ID of the restore job.</p>
     */
    @NameInMap("RestoreId")
    public String restoreId;

    /**
     * <p>The ID of the backup vault.</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static CancelRestoreJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelRestoreJobRequest self = new CancelRestoreJobRequest();
        return TeaModel.build(map, self);
    }

    public CancelRestoreJobRequest setRestoreId(String restoreId) {
        this.restoreId = restoreId;
        return this;
    }
    public String getRestoreId() {
        return this.restoreId;
    }

    public CancelRestoreJobRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
