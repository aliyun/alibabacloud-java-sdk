// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetTURNCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTURNCredentialsResponseBody body;

    public static GetTURNCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTURNCredentialsResponse self = new GetTURNCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public GetTURNCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTURNCredentialsResponse setBody(GetTURNCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTURNCredentialsResponseBody getBody() {
        return this.body;
    }

}
