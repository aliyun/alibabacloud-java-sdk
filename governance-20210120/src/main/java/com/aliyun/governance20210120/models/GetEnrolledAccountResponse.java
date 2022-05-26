// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class GetEnrolledAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetEnrolledAccountResponseBody body;

    public static GetEnrolledAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEnrolledAccountResponse self = new GetEnrolledAccountResponse();
        return TeaModel.build(map, self);
    }

    public GetEnrolledAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEnrolledAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEnrolledAccountResponse setBody(GetEnrolledAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEnrolledAccountResponseBody getBody() {
        return this.body;
    }

}
