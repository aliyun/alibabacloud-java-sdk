// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CreateBusinessBaselineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBusinessBaselineResponseBody body;

    public static CreateBusinessBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessBaselineResponse self = new CreateBusinessBaselineResponse();
        return TeaModel.build(map, self);
    }

    public CreateBusinessBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBusinessBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBusinessBaselineResponse setBody(CreateBusinessBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBusinessBaselineResponseBody getBody() {
        return this.body;
    }

}
