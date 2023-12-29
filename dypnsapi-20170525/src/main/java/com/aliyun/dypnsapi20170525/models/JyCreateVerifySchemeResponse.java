// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class JyCreateVerifySchemeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public JyCreateVerifySchemeResponseBody body;

    public static JyCreateVerifySchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        JyCreateVerifySchemeResponse self = new JyCreateVerifySchemeResponse();
        return TeaModel.build(map, self);
    }

    public JyCreateVerifySchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JyCreateVerifySchemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JyCreateVerifySchemeResponse setBody(JyCreateVerifySchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public JyCreateVerifySchemeResponseBody getBody() {
        return this.body;
    }

}
