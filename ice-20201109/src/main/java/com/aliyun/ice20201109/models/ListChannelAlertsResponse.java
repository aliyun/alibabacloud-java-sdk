// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListChannelAlertsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChannelAlertsResponseBody body;

    public static ListChannelAlertsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChannelAlertsResponse self = new ListChannelAlertsResponse();
        return TeaModel.build(map, self);
    }

    public ListChannelAlertsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChannelAlertsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChannelAlertsResponse setBody(ListChannelAlertsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChannelAlertsResponseBody getBody() {
        return this.body;
    }

}
