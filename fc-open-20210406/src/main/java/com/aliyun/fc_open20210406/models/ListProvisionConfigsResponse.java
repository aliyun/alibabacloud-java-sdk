// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListProvisionConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProvisionConfigsResponseBody body;

    public static ListProvisionConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProvisionConfigsResponse self = new ListProvisionConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListProvisionConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProvisionConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProvisionConfigsResponse setBody(ListProvisionConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProvisionConfigsResponseBody getBody() {
        return this.body;
    }

}
