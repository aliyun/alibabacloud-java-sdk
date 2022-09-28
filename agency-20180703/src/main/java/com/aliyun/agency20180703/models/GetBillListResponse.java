// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetBillListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBillListResponseBody body;

    public static GetBillListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBillListResponse self = new GetBillListResponse();
        return TeaModel.build(map, self);
    }

    public GetBillListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBillListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBillListResponse setBody(GetBillListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBillListResponseBody getBody() {
        return this.body;
    }

}
