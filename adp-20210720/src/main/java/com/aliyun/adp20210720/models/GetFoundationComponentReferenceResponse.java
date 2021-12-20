// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetFoundationComponentReferenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFoundationComponentReferenceResponseBody body;

    public static GetFoundationComponentReferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFoundationComponentReferenceResponse self = new GetFoundationComponentReferenceResponse();
        return TeaModel.build(map, self);
    }

    public GetFoundationComponentReferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFoundationComponentReferenceResponse setBody(GetFoundationComponentReferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFoundationComponentReferenceResponseBody getBody() {
        return this.body;
    }

}
