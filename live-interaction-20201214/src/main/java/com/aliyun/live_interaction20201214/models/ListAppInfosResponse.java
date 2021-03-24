// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListAppInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppInfosResponseBody body;

    public static ListAppInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppInfosResponse self = new ListAppInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListAppInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppInfosResponse setBody(ListAppInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppInfosResponseBody getBody() {
        return this.body;
    }

}
