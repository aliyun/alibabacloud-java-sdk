// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListHttpsApplicationConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHttpsApplicationConfigurationsResponseBody body;

    public static ListHttpsApplicationConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHttpsApplicationConfigurationsResponse self = new ListHttpsApplicationConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public ListHttpsApplicationConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHttpsApplicationConfigurationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHttpsApplicationConfigurationsResponse setBody(ListHttpsApplicationConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHttpsApplicationConfigurationsResponseBody getBody() {
        return this.body;
    }

}
