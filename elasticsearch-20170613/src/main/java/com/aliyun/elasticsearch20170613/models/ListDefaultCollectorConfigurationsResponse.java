// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDefaultCollectorConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDefaultCollectorConfigurationsResponseBody body;

    public static ListDefaultCollectorConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDefaultCollectorConfigurationsResponse self = new ListDefaultCollectorConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public ListDefaultCollectorConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDefaultCollectorConfigurationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDefaultCollectorConfigurationsResponse setBody(ListDefaultCollectorConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDefaultCollectorConfigurationsResponseBody getBody() {
        return this.body;
    }

}
