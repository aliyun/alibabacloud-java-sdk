// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CloseBackupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F1A11940-0C34-4385-864F-A01E29B55F6A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloseBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseBackupResponseBody self = new CloseBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
