// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTagResourcesResponseBody body;

    public static ListTagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesResponse self = new ListTagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTagResourcesResponse setBody(ListTagResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTagResourcesResponseBody getBody() {
        return this.body;
    }

}
