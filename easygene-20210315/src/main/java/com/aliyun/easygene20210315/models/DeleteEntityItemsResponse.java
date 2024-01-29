// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DeleteEntityItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteEntityItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEntityItemsResponse setBody(DeleteEntityItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEntityItemsResponseBody getBody() {
        return this.body;
    }

}
