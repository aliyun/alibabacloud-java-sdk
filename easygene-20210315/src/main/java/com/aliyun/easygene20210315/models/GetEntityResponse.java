// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetEntityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEntityResponseBody body;

    public static GetEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEntityResponse self = new GetEntityResponse();
        return TeaModel.build(map, self);
    }

    public GetEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEntityResponse setBody(GetEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEntityResponseBody getBody() {
        return this.body;
    }

}
