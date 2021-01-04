// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VodAsyncScanResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static VodAsyncScanResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        VodAsyncScanResultsResponse self = new VodAsyncScanResultsResponse();
        return TeaModel.build(map, self);
    }

    public VodAsyncScanResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
