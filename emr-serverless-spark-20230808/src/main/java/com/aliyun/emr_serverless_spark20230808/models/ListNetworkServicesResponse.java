// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListNetworkServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNetworkServicesResponseBody body;

    public static ListNetworkServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkServicesResponse self = new ListNetworkServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListNetworkServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNetworkServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNetworkServicesResponse setBody(ListNetworkServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNetworkServicesResponseBody getBody() {
        return this.body;
    }

}
