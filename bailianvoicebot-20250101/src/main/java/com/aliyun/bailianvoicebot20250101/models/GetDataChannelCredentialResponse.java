// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class GetDataChannelCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataChannelCredentialResponseBody body;

    public static GetDataChannelCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataChannelCredentialResponse self = new GetDataChannelCredentialResponse();
        return TeaModel.build(map, self);
    }

    public GetDataChannelCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataChannelCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataChannelCredentialResponse setBody(GetDataChannelCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataChannelCredentialResponseBody getBody() {
        return this.body;
    }

}
