// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListExternalDataServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExternalDataServicesResponseBody body;

    public static ListExternalDataServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExternalDataServicesResponse self = new ListExternalDataServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListExternalDataServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExternalDataServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExternalDataServicesResponse setBody(ListExternalDataServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExternalDataServicesResponseBody getBody() {
        return this.body;
    }

}
