// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListModelServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelServicesResponseBody body;

    public static ListModelServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelServicesResponse self = new ListModelServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListModelServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelServicesResponse setBody(ListModelServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelServicesResponseBody getBody() {
        return this.body;
    }

}
