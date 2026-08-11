// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListAlertAggregationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlertAggregationsResponseBody body;

    public static ListAlertAggregationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertAggregationsResponse self = new ListAlertAggregationsResponse();
        return TeaModel.build(map, self);
    }

    public ListAlertAggregationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlertAggregationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlertAggregationsResponse setBody(ListAlertAggregationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlertAggregationsResponseBody getBody() {
        return this.body;
    }

}
