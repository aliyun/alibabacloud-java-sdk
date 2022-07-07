// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetDeductionInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeductionInfoResponseBody body;

    public static GetDeductionInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeductionInfoResponse self = new GetDeductionInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDeductionInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeductionInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeductionInfoResponse setBody(GetDeductionInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeductionInfoResponseBody getBody() {
        return this.body;
    }

}
