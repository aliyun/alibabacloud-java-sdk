// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class AsyncScanAppMPCDResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AsyncScanAppMPCDResponseBody body;

    public static AsyncScanAppMPCDResponse build(java.util.Map<String, ?> map) throws Exception {
        AsyncScanAppMPCDResponse self = new AsyncScanAppMPCDResponse();
        return TeaModel.build(map, self);
    }

    public AsyncScanAppMPCDResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AsyncScanAppMPCDResponse setBody(AsyncScanAppMPCDResponseBody body) {
        this.body = body;
        return this;
    }
    public AsyncScanAppMPCDResponseBody getBody() {
        return this.body;
    }

}
