// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VodAsyncScanResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VodAsyncScanResultsResponseBody body;

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

    public VodAsyncScanResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VodAsyncScanResultsResponse setBody(VodAsyncScanResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public VodAsyncScanResultsResponseBody getBody() {
        return this.body;
    }

}
