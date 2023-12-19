// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CancelBackupJobRequest extends TeaModel {
    /**
     * <p>The ID of the backup job.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ID of the backup vault.</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static CancelBackupJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelBackupJobRequest self = new CancelBackupJobRequest();
        return TeaModel.build(map, self);
    }

    public CancelBackupJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CancelBackupJobRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
