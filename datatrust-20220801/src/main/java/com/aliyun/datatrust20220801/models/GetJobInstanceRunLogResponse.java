// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetJobInstanceRunLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetJobInstanceRunLogResponseBody body;

    public static GetJobInstanceRunLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobInstanceRunLogResponse self = new GetJobInstanceRunLogResponse();
        return TeaModel.build(map, self);
    }

    public GetJobInstanceRunLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobInstanceRunLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobInstanceRunLogResponse setBody(GetJobInstanceRunLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobInstanceRunLogResponseBody getBody() {
        return this.body;
    }

}
