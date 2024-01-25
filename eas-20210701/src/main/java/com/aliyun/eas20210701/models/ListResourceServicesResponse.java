// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListResourceServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceServicesResponseBody body;

    public static ListResourceServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceServicesResponse self = new ListResourceServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceServicesResponse setBody(ListResourceServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceServicesResponseBody getBody() {
        return this.body;
    }

}
