// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetFoundationReferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFoundationReferenceResponseBody body;

    public static GetFoundationReferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFoundationReferenceResponse self = new GetFoundationReferenceResponse();
        return TeaModel.build(map, self);
    }

    public GetFoundationReferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFoundationReferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFoundationReferenceResponse setBody(GetFoundationReferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFoundationReferenceResponseBody getBody() {
        return this.body;
    }

}
