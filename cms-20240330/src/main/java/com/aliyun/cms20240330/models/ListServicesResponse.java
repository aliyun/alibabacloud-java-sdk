// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServicesResponseBody body;

    public static ListServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServicesResponse self = new ListServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServicesResponse setBody(ListServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServicesResponseBody getBody() {
        return this.body;
    }

}
