// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListApplicationMonitorDetectResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationMonitorDetectResultResponseBody body;

    public static ListApplicationMonitorDetectResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationMonitorDetectResultResponse self = new ListApplicationMonitorDetectResultResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationMonitorDetectResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationMonitorDetectResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationMonitorDetectResultResponse setBody(ListApplicationMonitorDetectResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationMonitorDetectResultResponseBody getBody() {
        return this.body;
    }

}
