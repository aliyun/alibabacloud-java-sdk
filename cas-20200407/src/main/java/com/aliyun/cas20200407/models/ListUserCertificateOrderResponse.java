// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListUserCertificateOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListUserCertificateOrderResponse setBody(ListUserCertificateOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserCertificateOrderResponseBody getBody() {
        return this.body;
    }

}
