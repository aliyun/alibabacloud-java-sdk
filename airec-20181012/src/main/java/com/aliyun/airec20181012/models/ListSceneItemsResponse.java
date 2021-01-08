// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListSceneItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListSceneItemsResponse setBody(ListSceneItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSceneItemsResponseBody getBody() {
        return this.body;
    }

}
