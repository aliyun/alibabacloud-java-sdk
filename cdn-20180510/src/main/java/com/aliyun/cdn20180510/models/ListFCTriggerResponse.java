// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListFCTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFCTriggerResponseBody body;

    public static ListFCTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFCTriggerResponse self = new ListFCTriggerResponse();
        return TeaModel.build(map, self);
    }

    public ListFCTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFCTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFCTriggerResponse setBody(ListFCTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFCTriggerResponseBody getBody() {
        return this.body;
    }

}
