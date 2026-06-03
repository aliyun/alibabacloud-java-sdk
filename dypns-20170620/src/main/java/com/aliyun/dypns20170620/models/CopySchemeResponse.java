// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CopySchemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopySchemeResponseBody body;

    public static CopySchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        CopySchemeResponse self = new CopySchemeResponse();
        return TeaModel.build(map, self);
    }

    public CopySchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopySchemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopySchemeResponse setBody(CopySchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public CopySchemeResponseBody getBody() {
        return this.body;
    }

}
