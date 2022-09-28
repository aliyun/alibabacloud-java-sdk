// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetDailyBillListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDailyBillListResponseBody body;

    public static GetDailyBillListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDailyBillListResponse self = new GetDailyBillListResponse();
        return TeaModel.build(map, self);
    }

    public GetDailyBillListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDailyBillListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDailyBillListResponse setBody(GetDailyBillListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDailyBillListResponseBody getBody() {
        return this.body;
    }

}
