// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListCACertificateLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCACertificateLogResponseBody body;

    public static ListCACertificateLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCACertificateLogResponse self = new ListCACertificateLogResponse();
        return TeaModel.build(map, self);
    }

    public ListCACertificateLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCACertificateLogResponse setBody(ListCACertificateLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCACertificateLogResponseBody getBody() {
        return this.body;
    }

}
