// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateBackupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("BackupJobId")
    public Long backupJobId;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupResponseBody self = new CreateBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackupResponseBody setBackupJobId(Long backupJobId) {
        this.backupJobId = backupJobId;
        return this;
    }
    public Long getBackupJobId() {
        return this.backupJobId;
    }

    public CreateBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
