// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class RpcDataUploadTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RpcDataUploadTestResponseBody body;

    public static RpcDataUploadTestResponse build(java.util.Map<String, ?> map) throws Exception {
        RpcDataUploadTestResponse self = new RpcDataUploadTestResponse();
        return TeaModel.build(map, self);
    }

    public RpcDataUploadTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RpcDataUploadTestResponse setBody(RpcDataUploadTestResponseBody body) {
        this.body = body;
        return this;
    }
    public RpcDataUploadTestResponseBody getBody() {
        return this.body;
    }

}
