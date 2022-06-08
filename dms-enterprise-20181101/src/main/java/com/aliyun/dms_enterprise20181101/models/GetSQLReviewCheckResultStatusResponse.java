// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetSQLReviewCheckResultStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSQLReviewCheckResultStatusResponseBody body;

    public static GetSQLReviewCheckResultStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSQLReviewCheckResultStatusResponse self = new GetSQLReviewCheckResultStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetSQLReviewCheckResultStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSQLReviewCheckResultStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSQLReviewCheckResultStatusResponse setBody(GetSQLReviewCheckResultStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSQLReviewCheckResultStatusResponseBody getBody() {
        return this.body;
    }

}
