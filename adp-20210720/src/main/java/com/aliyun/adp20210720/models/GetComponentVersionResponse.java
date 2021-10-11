// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetComponentVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetComponentVersionResponseBody body;

    public static GetComponentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComponentVersionResponse self = new GetComponentVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetComponentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetComponentVersionResponse setBody(GetComponentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetComponentVersionResponseBody getBody() {
        return this.body;
    }

}
