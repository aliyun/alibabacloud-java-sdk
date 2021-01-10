// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetModelDetailByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetModelDetailByIdResponseBody body;

    public static GetModelDetailByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelDetailByIdResponse self = new GetModelDetailByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetModelDetailByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelDetailByIdResponse setBody(GetModelDetailByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelDetailByIdResponseBody getBody() {
        return this.body;
    }

}
