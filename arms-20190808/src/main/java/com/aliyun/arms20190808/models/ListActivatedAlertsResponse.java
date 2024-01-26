// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListActivatedAlertsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListActivatedAlertsResponseBody body;

    public static ListActivatedAlertsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListActivatedAlertsResponse self = new ListActivatedAlertsResponse();
        return TeaModel.build(map, self);
    }

    public ListActivatedAlertsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListActivatedAlertsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListActivatedAlertsResponse setBody(ListActivatedAlertsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListActivatedAlertsResponseBody getBody() {
        return this.body;
    }

}
