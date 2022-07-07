// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetItemDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetItemDetailResponseBody body;

    public static GetItemDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetItemDetailResponse self = new GetItemDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetItemDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetItemDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetItemDetailResponse setBody(GetItemDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetItemDetailResponseBody getBody() {
        return this.body;
    }

}
