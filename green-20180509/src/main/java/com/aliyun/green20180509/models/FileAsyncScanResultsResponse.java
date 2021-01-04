// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class FileAsyncScanResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static FileAsyncScanResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        FileAsyncScanResultsResponse self = new FileAsyncScanResultsResponse();
        return TeaModel.build(map, self);
    }

    public FileAsyncScanResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
