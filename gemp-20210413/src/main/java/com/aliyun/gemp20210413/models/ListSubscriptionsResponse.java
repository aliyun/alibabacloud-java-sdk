// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSubscriptionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
