// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductEnvironmentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProductEnvironmentsResponseBody body;

    public static GetProductEnvironmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductEnvironmentsResponse self = new GetProductEnvironmentsResponse();
        return TeaModel.build(map, self);
    }

    public GetProductEnvironmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductEnvironmentsResponse setBody(GetProductEnvironmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductEnvironmentsResponseBody getBody() {
        return this.body;
    }

}
