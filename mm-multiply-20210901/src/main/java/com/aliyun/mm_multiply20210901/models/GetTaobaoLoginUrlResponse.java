// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetTaobaoLoginUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaobaoLoginUrlResponseBody body;

    public static GetTaobaoLoginUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaobaoLoginUrlResponse self = new GetTaobaoLoginUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetTaobaoLoginUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaobaoLoginUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaobaoLoginUrlResponse setBody(GetTaobaoLoginUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaobaoLoginUrlResponseBody getBody() {
        return this.body;
    }

}
