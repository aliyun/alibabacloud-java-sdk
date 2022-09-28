// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetShareCustomerListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetShareCustomerListResponseBody body;

    public static GetShareCustomerListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetShareCustomerListResponse self = new GetShareCustomerListResponse();
        return TeaModel.build(map, self);
    }

    public GetShareCustomerListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetShareCustomerListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetShareCustomerListResponse setBody(GetShareCustomerListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetShareCustomerListResponseBody getBody() {
        return this.body;
    }

}
