// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteApiProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteApiProductResponseBody body;

    public static DeleteApiProductResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiProductResponse self = new DeleteApiProductResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApiProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApiProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApiProductResponse setBody(DeleteApiProductResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApiProductResponseBody getBody() {
        return this.body;
    }

}
