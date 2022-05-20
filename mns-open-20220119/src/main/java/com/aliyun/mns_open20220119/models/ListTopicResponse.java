// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListTopicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTopicResponseBody body;

    public static ListTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTopicResponse self = new ListTopicResponse();
        return TeaModel.build(map, self);
    }

    public ListTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTopicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTopicResponse setBody(ListTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTopicResponseBody getBody() {
        return this.body;
    }

}
