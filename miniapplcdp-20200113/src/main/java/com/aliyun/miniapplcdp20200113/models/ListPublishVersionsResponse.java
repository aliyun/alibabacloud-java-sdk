// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListPublishVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPublishVersionsResponseBody body;

    public static ListPublishVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishVersionsResponse self = new ListPublishVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublishVersionsResponse setBody(ListPublishVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublishVersionsResponseBody getBody() {
        return this.body;
    }

}
