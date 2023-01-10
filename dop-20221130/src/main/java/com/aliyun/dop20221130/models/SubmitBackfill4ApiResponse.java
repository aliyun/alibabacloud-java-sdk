// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dop20221130.models;

import com.aliyun.tea.*;

public class SubmitBackfill4ApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitBackfill4ApiResponseBody body;

    public static SubmitBackfill4ApiResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitBackfill4ApiResponse self = new SubmitBackfill4ApiResponse();
        return TeaModel.build(map, self);
    }

    public SubmitBackfill4ApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitBackfill4ApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitBackfill4ApiResponse setBody(SubmitBackfill4ApiResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitBackfill4ApiResponseBody getBody() {
        return this.body;
    }

}
