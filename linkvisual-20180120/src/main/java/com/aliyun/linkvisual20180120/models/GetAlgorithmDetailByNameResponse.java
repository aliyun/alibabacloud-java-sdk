// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAlgorithmDetailByNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlgorithmDetailByNameResponseBody body;

    public static GetAlgorithmDetailByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDetailByNameResponse self = new GetAlgorithmDetailByNameResponse();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDetailByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlgorithmDetailByNameResponse setBody(GetAlgorithmDetailByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlgorithmDetailByNameResponseBody getBody() {
        return this.body;
    }

}
