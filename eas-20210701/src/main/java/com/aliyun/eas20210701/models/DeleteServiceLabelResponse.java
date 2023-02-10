// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteServiceLabelResponseBody body;

    public static DeleteServiceLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceLabelResponse self = new DeleteServiceLabelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceLabelResponse setBody(DeleteServiceLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceLabelResponseBody getBody() {
        return this.body;
    }

}
