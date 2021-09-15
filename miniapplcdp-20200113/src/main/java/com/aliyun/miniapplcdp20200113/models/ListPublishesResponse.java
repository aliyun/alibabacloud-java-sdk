// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListPublishesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPublishesResponseBody body;

    public static ListPublishesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishesResponse self = new ListPublishesResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublishesResponse setBody(ListPublishesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublishesResponseBody getBody() {
        return this.body;
    }

}
