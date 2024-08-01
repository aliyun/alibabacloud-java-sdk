// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class TransferClusterBackupResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the instance is switched to the cluster backup mode. If the value of this parameter is <strong>1</strong>, the instance is switched to the cluster backup mode.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AlreadyDone")
    public String alreadyDone;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3C4A2494-85C4-45C5-93CF-548DB3375193</p>
     */
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
