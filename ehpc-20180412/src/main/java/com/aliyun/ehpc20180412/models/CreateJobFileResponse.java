// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateJobFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateJobFileResponseBody body;

    public static CreateJobFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateJobFileResponse self = new CreateJobFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateJobFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateJobFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateJobFileResponse setBody(CreateJobFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateJobFileResponseBody getBody() {
        return this.body;
    }

}
