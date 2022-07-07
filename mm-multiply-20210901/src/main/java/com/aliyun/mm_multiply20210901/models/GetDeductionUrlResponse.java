// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetDeductionUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeductionUrlResponseBody body;

    public static GetDeductionUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeductionUrlResponse self = new GetDeductionUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetDeductionUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeductionUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeductionUrlResponse setBody(GetDeductionUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeductionUrlResponseBody getBody() {
        return this.body;
    }

}
