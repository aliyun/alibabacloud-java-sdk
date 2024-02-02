// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteProductTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProductTagsResponseBody body;

    public static DeleteProductTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductTagsResponse self = new DeleteProductTagsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProductTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProductTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProductTagsResponse setBody(DeleteProductTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProductTagsResponseBody getBody() {
        return this.body;
    }

}
