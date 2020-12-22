// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GetBodyPersonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBodyPersonResponseBody body;

    public static GetBodyPersonResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBodyPersonResponse self = new GetBodyPersonResponse();
        return TeaModel.build(map, self);
    }

    public GetBodyPersonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBodyPersonResponse setBody(GetBodyPersonResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBodyPersonResponseBody getBody() {
        return this.body;
    }

}
