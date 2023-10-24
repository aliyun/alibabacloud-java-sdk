// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderCreateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InsureOrderCreateResponseBody body;

    public static InsureOrderCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderCreateResponse self = new InsureOrderCreateResponse();
        return TeaModel.build(map, self);
    }

    public InsureOrderCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsureOrderCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsureOrderCreateResponse setBody(InsureOrderCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public InsureOrderCreateResponseBody getBody() {
        return this.body;
    }

}
