// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class GetSchemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSchemeResponseBody body;

    public static GetSchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSchemeResponse self = new GetSchemeResponse();
        return TeaModel.build(map, self);
    }

    public GetSchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSchemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSchemeResponse setBody(GetSchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSchemeResponseBody getBody() {
        return this.body;
    }

}
