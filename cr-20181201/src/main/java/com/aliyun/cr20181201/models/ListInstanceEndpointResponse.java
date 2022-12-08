// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListInstanceEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstanceEndpointResponseBody body;

    public static ListInstanceEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceEndpointResponse self = new ListInstanceEndpointResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceEndpointResponse setBody(ListInstanceEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceEndpointResponseBody getBody() {
        return this.body;
    }

}
