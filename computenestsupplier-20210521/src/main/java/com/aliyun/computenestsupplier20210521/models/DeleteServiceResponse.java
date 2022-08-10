// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class DeleteServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteServiceResponseBody body;

    public static DeleteServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceResponse self = new DeleteServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceResponse setBody(DeleteServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceResponseBody getBody() {
        return this.body;
    }

}
