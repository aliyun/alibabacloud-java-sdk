// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListRecentChangeOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRecentChangeOrderResponseBody body;

    public static ListRecentChangeOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecentChangeOrderResponse self = new ListRecentChangeOrderResponse();
        return TeaModel.build(map, self);
    }

    public ListRecentChangeOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecentChangeOrderResponse setBody(ListRecentChangeOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecentChangeOrderResponseBody getBody() {
        return this.body;
    }

}
