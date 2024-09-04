// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class FileAsyncScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static FileAsyncScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FileAsyncScanResponseBody self = new FileAsyncScanResponseBody();
        return TeaModel.build(map, self);
    }

    public FileAsyncScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
