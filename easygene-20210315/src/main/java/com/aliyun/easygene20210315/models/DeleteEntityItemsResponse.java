// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DeleteEntityItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEntityItemsResponseBody body;

    public static DeleteEntityItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEntityItemsResponse self = new DeleteEntityItemsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEntityItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEntityItemsResponse setBody(DeleteEntityItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEntityItemsResponseBody getBody() {
        return this.body;
    }

}
