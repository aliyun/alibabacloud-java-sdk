// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CopyVerifySchemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyVerifySchemeResponseBody body;

    public static CopyVerifySchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyVerifySchemeResponse self = new CopyVerifySchemeResponse();
        return TeaModel.build(map, self);
    }

    public CopyVerifySchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyVerifySchemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyVerifySchemeResponse setBody(CopyVerifySchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyVerifySchemeResponseBody getBody() {
        return this.body;
    }

}
