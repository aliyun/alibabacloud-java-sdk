// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class OpenBackupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C977DF60-7D06-4E34-A27D-8BC696C5112A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenBackupResponseBody self = new OpenBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
