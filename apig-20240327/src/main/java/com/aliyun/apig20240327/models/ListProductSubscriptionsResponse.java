// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListProductSubscriptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductSubscriptionsResponseBody body;

    public static ListProductSubscriptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductSubscriptionsResponse self = new ListProductSubscriptionsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductSubscriptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductSubscriptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductSubscriptionsResponse setBody(ListProductSubscriptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductSubscriptionsResponseBody getBody() {
        return this.body;
    }

}
