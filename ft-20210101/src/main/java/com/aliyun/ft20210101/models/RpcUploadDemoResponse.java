// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class RpcUploadDemoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RpcUploadDemoResponseBody body;

    public static RpcUploadDemoResponse build(java.util.Map<String, ?> map) throws Exception {
        RpcUploadDemoResponse self = new RpcUploadDemoResponse();
        return TeaModel.build(map, self);
    }

    public RpcUploadDemoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RpcUploadDemoResponse setBody(RpcUploadDemoResponseBody body) {
        this.body = body;
        return this;
    }
    public RpcUploadDemoResponseBody getBody() {
        return this.body;
    }

}
