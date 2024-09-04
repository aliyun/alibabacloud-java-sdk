// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class FileAsyncScanResultsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static FileAsyncScanResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FileAsyncScanResultsResponseBody self = new FileAsyncScanResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public FileAsyncScanResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
