// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBusinessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBusinessResponseBody body;

    public static GetBusinessResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessResponse self = new GetBusinessResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusinessResponse setBody(GetBusinessResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusinessResponseBody getBody() {
        return this.body;
    }

}
