// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertRobotsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlertRobotsResponseBody body;

    public static ListAlertRobotsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertRobotsResponse self = new ListAlertRobotsResponse();
        return TeaModel.build(map, self);
    }

    public ListAlertRobotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlertRobotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlertRobotsResponse setBody(ListAlertRobotsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlertRobotsResponseBody getBody() {
        return this.body;
    }

}
