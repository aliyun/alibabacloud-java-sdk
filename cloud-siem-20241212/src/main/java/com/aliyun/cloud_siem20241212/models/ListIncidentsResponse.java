// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListIncidentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIncidentsResponseBody body;

    public static ListIncidentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentsResponse self = new ListIncidentsResponse();
        return TeaModel.build(map, self);
    }

    public ListIncidentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIncidentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIncidentsResponse setBody(ListIncidentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIncidentsResponseBody getBody() {
        return this.body;
    }

}
