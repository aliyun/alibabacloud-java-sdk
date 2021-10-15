// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DeleteItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteItemResponseBody body;

    public static DeleteItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteItemResponse self = new DeleteItemResponse();
        return TeaModel.build(map, self);
    }

    public DeleteItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteItemResponse setBody(DeleteItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteItemResponseBody getBody() {
        return this.body;
    }

}
