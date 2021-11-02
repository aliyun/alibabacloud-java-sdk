// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetCustomServiceUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCustomServiceUrlResponseBody body;

    public static GetCustomServiceUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomServiceUrlResponse self = new GetCustomServiceUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomServiceUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomServiceUrlResponse setBody(GetCustomServiceUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomServiceUrlResponseBody getBody() {
        return this.body;
    }

}
