// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetIconStsCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetIconStsCredentialResponseBody body;

    public static GetIconStsCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIconStsCredentialResponse self = new GetIconStsCredentialResponse();
        return TeaModel.build(map, self);
    }

    public GetIconStsCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIconStsCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIconStsCredentialResponse setBody(GetIconStsCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIconStsCredentialResponseBody getBody() {
        return this.body;
    }

}
