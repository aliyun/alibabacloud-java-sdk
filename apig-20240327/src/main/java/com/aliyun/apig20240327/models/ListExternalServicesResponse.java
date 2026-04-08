// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListExternalServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExternalServicesResponseBody body;

    public static ListExternalServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExternalServicesResponse self = new ListExternalServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListExternalServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExternalServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExternalServicesResponse setBody(ListExternalServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExternalServicesResponseBody getBody() {
        return this.body;
    }

}
