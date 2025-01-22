// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteBackupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupResponseBody self = new DeleteBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
