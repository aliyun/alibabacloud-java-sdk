// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class GetSlsOpenStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSlsOpenStatusResponseBody body;

    public static GetSlsOpenStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSlsOpenStatusResponse self = new GetSlsOpenStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetSlsOpenStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSlsOpenStatusResponse setBody(GetSlsOpenStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSlsOpenStatusResponseBody getBody() {
        return this.body;
    }

}
