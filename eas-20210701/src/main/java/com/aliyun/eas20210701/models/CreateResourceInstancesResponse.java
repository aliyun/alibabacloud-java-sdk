// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateResourceInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateResourceInstancesResponseBody body;

    public static CreateResourceInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceInstancesResponse self = new CreateResourceInstancesResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateResourceInstancesResponse setBody(CreateResourceInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceInstancesResponseBody getBody() {
        return this.body;
    }

}
