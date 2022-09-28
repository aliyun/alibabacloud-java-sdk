// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetMonthBillListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMonthBillListResponseBody body;

    public static GetMonthBillListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMonthBillListResponse self = new GetMonthBillListResponse();
        return TeaModel.build(map, self);
    }

    public GetMonthBillListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMonthBillListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMonthBillListResponse setBody(GetMonthBillListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMonthBillListResponseBody getBody() {
        return this.body;
    }

}
