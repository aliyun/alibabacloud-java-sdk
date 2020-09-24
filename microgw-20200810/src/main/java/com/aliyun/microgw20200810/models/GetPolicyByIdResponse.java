// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetPolicyByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPolicyByIdResponseBody body;

    public static GetPolicyByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyByIdResponse self = new GetPolicyByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetPolicyByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPolicyByIdResponse setBody(GetPolicyByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPolicyByIdResponseBody getBody() {
        return this.body;
    }

}
