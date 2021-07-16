// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSubscriptionServiceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSubscriptionServiceGroupsResponseBody body;

    public static ListSubscriptionServiceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionServiceGroupsResponse self = new ListSubscriptionServiceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionServiceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubscriptionServiceGroupsResponse setBody(ListSubscriptionServiceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubscriptionServiceGroupsResponseBody getBody() {
        return this.body;
    }

}
