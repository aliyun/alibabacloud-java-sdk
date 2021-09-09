// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetElastictaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetElastictaskResponseBody body;

    public static GetElastictaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetElastictaskResponse self = new GetElastictaskResponse();
        return TeaModel.build(map, self);
    }

    public GetElastictaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetElastictaskResponse setBody(GetElastictaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetElastictaskResponseBody getBody() {
        return this.body;
    }

}
