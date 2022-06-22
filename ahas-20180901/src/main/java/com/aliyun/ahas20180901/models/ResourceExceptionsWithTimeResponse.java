// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ResourceExceptionsWithTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResourceExceptionsWithTimeResponseBody body;

    public static ResourceExceptionsWithTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ResourceExceptionsWithTimeResponse self = new ResourceExceptionsWithTimeResponse();
        return TeaModel.build(map, self);
    }

    public ResourceExceptionsWithTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResourceExceptionsWithTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResourceExceptionsWithTimeResponse setBody(ResourceExceptionsWithTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ResourceExceptionsWithTimeResponseBody getBody() {
        return this.body;
    }

}
