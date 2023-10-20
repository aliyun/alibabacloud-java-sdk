// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class TransferClusterBackupResponseBody extends TeaModel {
    @NameInMap("AlreadyDone")
    public String alreadyDone;

    @NameInMap("RequestId")
    public String requestId;

    public static TransferClusterBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransferClusterBackupResponseBody self = new TransferClusterBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public TransferClusterBackupResponseBody setAlreadyDone(String alreadyDone) {
        this.alreadyDone = alreadyDone;
        return this;
    }
    public String getAlreadyDone() {
        return this.alreadyDone;
    }

    public TransferClusterBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
