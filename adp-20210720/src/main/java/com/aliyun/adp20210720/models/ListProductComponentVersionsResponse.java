// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductComponentVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProductComponentVersionsResponseBody body;

    public static ListProductComponentVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductComponentVersionsResponse self = new ListProductComponentVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductComponentVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductComponentVersionsResponse setBody(ListProductComponentVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductComponentVersionsResponseBody getBody() {
        return this.body;
    }

}
