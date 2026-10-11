// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class ListEgressProxyConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEgressProxyConfigurationsResponseBody body;

    public static ListEgressProxyConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEgressProxyConfigurationsResponse self = new ListEgressProxyConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public ListEgressProxyConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEgressProxyConfigurationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEgressProxyConfigurationsResponse setBody(ListEgressProxyConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEgressProxyConfigurationsResponseBody getBody() {
        return this.body;
    }

}
