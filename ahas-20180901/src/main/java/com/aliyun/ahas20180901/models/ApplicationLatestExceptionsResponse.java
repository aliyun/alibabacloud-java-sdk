// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ApplicationLatestExceptionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApplicationLatestExceptionsResponseBody body;

    public static ApplicationLatestExceptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplicationLatestExceptionsResponse self = new ApplicationLatestExceptionsResponse();
        return TeaModel.build(map, self);
    }

    public ApplicationLatestExceptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplicationLatestExceptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplicationLatestExceptionsResponse setBody(ApplicationLatestExceptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplicationLatestExceptionsResponseBody getBody() {
        return this.body;
    }

}
