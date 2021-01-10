// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAlgorithmDetailByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlgorithmDetailByIdResponseBody body;

    public static GetAlgorithmDetailByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDetailByIdResponse self = new GetAlgorithmDetailByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDetailByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlgorithmDetailByIdResponse setBody(GetAlgorithmDetailByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlgorithmDetailByIdResponseBody getBody() {
        return this.body;
    }

}
