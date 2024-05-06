// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class CloseBackupResponseBody extends TeaModel {
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
