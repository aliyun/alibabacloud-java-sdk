// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetOssCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOssCredentialsResponseBody body;

    public static GetOssCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssCredentialsResponse self = new GetOssCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public GetOssCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssCredentialsResponse setBody(GetOssCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssCredentialsResponseBody getBody() {
        return this.body;
    }

}
