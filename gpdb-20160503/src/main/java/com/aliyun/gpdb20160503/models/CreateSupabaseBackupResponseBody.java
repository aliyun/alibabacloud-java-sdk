// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateSupabaseBackupResponseBody extends TeaModel {
    /**
     * <p>The ID of the backup job. You can call ListSupabaseBackupJobs to query the status and progress of the corresponding job.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("BackupJobId")
    public Long backupJobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSupabaseBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSupabaseBackupResponseBody self = new CreateSupabaseBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSupabaseBackupResponseBody setBackupJobId(Long backupJobId) {
        this.backupJobId = backupJobId;
        return this;
    }
    public Long getBackupJobId() {
        return this.backupJobId;
    }

    public CreateSupabaseBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
