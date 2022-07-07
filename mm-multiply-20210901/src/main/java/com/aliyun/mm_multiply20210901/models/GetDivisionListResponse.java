// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetDivisionListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDivisionListResponseBody body;

    public static GetDivisionListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDivisionListResponse self = new GetDivisionListResponse();
        return TeaModel.build(map, self);
    }

    public GetDivisionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDivisionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDivisionListResponse setBody(GetDivisionListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDivisionListResponseBody getBody() {
        return this.body;
    }

}
