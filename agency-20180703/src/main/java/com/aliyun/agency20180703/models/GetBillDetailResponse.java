// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetBillDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBillDetailResponseBody body;

    public static GetBillDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBillDetailResponse self = new GetBillDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetBillDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBillDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBillDetailResponse setBody(GetBillDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBillDetailResponseBody getBody() {
        return this.body;
    }

}
