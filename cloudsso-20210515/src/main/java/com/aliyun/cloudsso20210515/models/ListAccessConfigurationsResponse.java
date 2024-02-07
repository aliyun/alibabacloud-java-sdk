// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAccessConfigurationsResponseBody body;

    public static ListAccessConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccessConfigurationsResponse self = new ListAccessConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public ListAccessConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccessConfigurationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccessConfigurationsResponse setBody(ListAccessConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccessConfigurationsResponseBody getBody() {
        return this.body;
    }

}
