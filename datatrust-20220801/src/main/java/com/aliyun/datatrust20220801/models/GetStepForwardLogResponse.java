// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetStepForwardLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetStepForwardLogResponseBody body;

    public static GetStepForwardLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStepForwardLogResponse self = new GetStepForwardLogResponse();
        return TeaModel.build(map, self);
    }

    public GetStepForwardLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStepForwardLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStepForwardLogResponse setBody(GetStepForwardLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStepForwardLogResponseBody getBody() {
        return this.body;
    }

}
