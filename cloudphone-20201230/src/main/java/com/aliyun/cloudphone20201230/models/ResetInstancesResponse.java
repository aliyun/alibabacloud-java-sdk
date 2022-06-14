// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ResetInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResetInstancesResponseBody body;

    public static ResetInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetInstancesResponse self = new ResetInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ResetInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetInstancesResponse setBody(ResetInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetInstancesResponseBody getBody() {
        return this.body;
    }

}
