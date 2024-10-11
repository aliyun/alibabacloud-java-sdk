// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListSceneItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSceneItemsResponseBody body;

    public static ListSceneItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSceneItemsResponse self = new ListSceneItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListSceneItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSceneItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSceneItemsResponse setBody(ListSceneItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSceneItemsResponseBody getBody() {
        return this.body;
    }

}
