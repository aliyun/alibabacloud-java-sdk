// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VodAsyncScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VodAsyncScanResponseBody body;

    public static VodAsyncScanResponse build(java.util.Map<String, ?> map) throws Exception {
        VodAsyncScanResponse self = new VodAsyncScanResponse();
        return TeaModel.build(map, self);
    }

    public VodAsyncScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VodAsyncScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VodAsyncScanResponse setBody(VodAsyncScanResponseBody body) {
        this.body = body;
        return this;
    }
    public VodAsyncScanResponseBody getBody() {
        return this.body;
    }

}
