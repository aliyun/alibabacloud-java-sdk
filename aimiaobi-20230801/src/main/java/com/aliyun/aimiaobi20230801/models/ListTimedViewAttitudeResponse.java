// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListTimedViewAttitudeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTimedViewAttitudeResponseBody body;

    public static ListTimedViewAttitudeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTimedViewAttitudeResponse self = new ListTimedViewAttitudeResponse();
        return TeaModel.build(map, self);
    }

    public ListTimedViewAttitudeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTimedViewAttitudeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTimedViewAttitudeResponse setBody(ListTimedViewAttitudeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTimedViewAttitudeResponseBody getBody() {
        return this.body;
    }

}
