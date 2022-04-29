// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetJwtCommonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJwtCommonResponseBody body;

    public static GetJwtCommonResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJwtCommonResponse self = new GetJwtCommonResponse();
        return TeaModel.build(map, self);
    }

    public GetJwtCommonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJwtCommonResponse setBody(GetJwtCommonResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJwtCommonResponseBody getBody() {
        return this.body;
    }

}
