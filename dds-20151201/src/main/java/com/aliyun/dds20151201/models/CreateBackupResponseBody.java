// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateBackupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BackupId")
    public String backupId;

    public static CreateBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupResponseBody self = new CreateBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBackupResponseBody setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

}
