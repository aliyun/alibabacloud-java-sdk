// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentDetailTimelinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIncidentDetailTimelinesResponseBody body;

    public static ListIncidentDetailTimelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentDetailTimelinesResponse self = new ListIncidentDetailTimelinesResponse();
        return TeaModel.build(map, self);
    }

    public ListIncidentDetailTimelinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIncidentDetailTimelinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIncidentDetailTimelinesResponse setBody(ListIncidentDetailTimelinesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIncidentDetailTimelinesResponseBody getBody() {
        return this.body;
    }

}
