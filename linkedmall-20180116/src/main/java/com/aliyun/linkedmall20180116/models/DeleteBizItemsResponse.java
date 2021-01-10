// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class DeleteBizItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBizItemsResponseBody body;

    public static DeleteBizItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBizItemsResponse self = new DeleteBizItemsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBizItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBizItemsResponse setBody(DeleteBizItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBizItemsResponseBody getBody() {
        return this.body;
    }

}
