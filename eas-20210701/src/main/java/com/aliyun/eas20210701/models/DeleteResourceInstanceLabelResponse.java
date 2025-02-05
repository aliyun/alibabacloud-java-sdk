// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteResourceInstanceLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteResourceInstanceLabelResponseBody body;

    public static DeleteResourceInstanceLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceInstanceLabelResponse self = new DeleteResourceInstanceLabelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceInstanceLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceInstanceLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResourceInstanceLabelResponse setBody(DeleteResourceInstanceLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceInstanceLabelResponseBody getBody() {
        return this.body;
    }

}
