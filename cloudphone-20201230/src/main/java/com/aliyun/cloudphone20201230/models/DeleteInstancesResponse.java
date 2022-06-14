// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class DeleteInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInstancesResponseBody body;

    public static DeleteInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstancesResponse self = new DeleteInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInstancesResponse setBody(DeleteInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstancesResponseBody getBody() {
        return this.body;
    }

}
