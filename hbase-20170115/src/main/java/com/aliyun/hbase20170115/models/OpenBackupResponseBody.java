// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class OpenBackupResponseBody extends TeaModel {
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
