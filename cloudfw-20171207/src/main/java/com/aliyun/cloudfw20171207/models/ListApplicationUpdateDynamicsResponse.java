// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListApplicationUpdateDynamicsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationUpdateDynamicsResponseBody body;

    public static ListApplicationUpdateDynamicsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationUpdateDynamicsResponse self = new ListApplicationUpdateDynamicsResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationUpdateDynamicsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationUpdateDynamicsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationUpdateDynamicsResponse setBody(ListApplicationUpdateDynamicsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationUpdateDynamicsResponseBody getBody() {
        return this.body;
    }

}
