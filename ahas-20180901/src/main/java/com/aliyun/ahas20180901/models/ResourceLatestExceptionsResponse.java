// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ResourceLatestExceptionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResourceLatestExceptionsResponseBody body;

    public static ResourceLatestExceptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ResourceLatestExceptionsResponse self = new ResourceLatestExceptionsResponse();
        return TeaModel.build(map, self);
    }

    public ResourceLatestExceptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResourceLatestExceptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResourceLatestExceptionsResponse setBody(ResourceLatestExceptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ResourceLatestExceptionsResponseBody getBody() {
        return this.body;
    }

}
