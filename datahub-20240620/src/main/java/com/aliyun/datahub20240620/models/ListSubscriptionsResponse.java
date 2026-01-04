// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class ListSubscriptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSubscriptionsResponseBody body;

    public static ListSubscriptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionsResponse self = new ListSubscriptionsResponse();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubscriptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubscriptionsResponse setBody(ListSubscriptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubscriptionsResponseBody getBody() {
        return this.body;
    }

}
