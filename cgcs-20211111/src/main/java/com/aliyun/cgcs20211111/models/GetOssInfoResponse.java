// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetOssInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOssInfoResponseBody body;

    public static GetOssInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssInfoResponse self = new GetOssInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetOssInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssInfoResponse setBody(GetOssInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssInfoResponseBody getBody() {
        return this.body;
    }

}
