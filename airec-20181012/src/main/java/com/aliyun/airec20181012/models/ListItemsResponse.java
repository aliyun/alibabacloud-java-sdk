// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListItemsResponseBody body;

    public static ListItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListItemsResponse self = new ListItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListItemsResponse setBody(ListItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListItemsResponseBody getBody() {
        return this.body;
    }

}
