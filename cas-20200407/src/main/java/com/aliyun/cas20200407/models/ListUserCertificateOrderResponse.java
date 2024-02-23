// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListUserCertificateOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserCertificateOrderResponseBody body;

    public static ListUserCertificateOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserCertificateOrderResponse self = new ListUserCertificateOrderResponse();
        return TeaModel.build(map, self);
    }

    public ListUserCertificateOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserCertificateOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserCertificateOrderResponse setBody(ListUserCertificateOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserCertificateOrderResponseBody getBody() {
        return this.body;
    }

}
