// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListInsightsEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInsightsEventsResponseBody body;

    public static ListInsightsEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInsightsEventsResponse self = new ListInsightsEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListInsightsEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInsightsEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInsightsEventsResponse setBody(ListInsightsEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInsightsEventsResponseBody getBody() {
        return this.body;
    }

}
