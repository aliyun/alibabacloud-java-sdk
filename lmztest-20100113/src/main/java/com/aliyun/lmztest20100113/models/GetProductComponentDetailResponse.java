// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20100113.models;

import com.aliyun.tea.*;

public class GetProductComponentDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetProductComponentDetailResponseBody body;

    public static GetProductComponentDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductComponentDetailResponse self = new GetProductComponentDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetProductComponentDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductComponentDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProductComponentDetailResponse setBody(GetProductComponentDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductComponentDetailResponseBody getBody() {
        return this.body;
    }

}
