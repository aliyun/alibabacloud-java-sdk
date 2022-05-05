// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListNotificationPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNotificationPoliciesResponseBody body;

    public static ListNotificationPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNotificationPoliciesResponse self = new ListNotificationPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListNotificationPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNotificationPoliciesResponse setBody(ListNotificationPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNotificationPoliciesResponseBody getBody() {
        return this.body;
    }

}
