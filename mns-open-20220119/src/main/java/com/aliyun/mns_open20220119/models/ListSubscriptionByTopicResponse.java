// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListSubscriptionByTopicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSubscriptionByTopicResponseBody body;

    public static ListSubscriptionByTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionByTopicResponse self = new ListSubscriptionByTopicResponse();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionByTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubscriptionByTopicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubscriptionByTopicResponse setBody(ListSubscriptionByTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubscriptionByTopicResponseBody getBody() {
        return this.body;
    }

}
