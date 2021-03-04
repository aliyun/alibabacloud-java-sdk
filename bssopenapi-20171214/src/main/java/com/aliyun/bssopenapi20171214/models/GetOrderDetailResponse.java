// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetOrderDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOrderDetailResponseBody body;

    public static GetOrderDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrderDetailResponse self = new GetOrderDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetOrderDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrderDetailResponse setBody(GetOrderDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrderDetailResponseBody getBody() {
        return this.body;
    }

}
