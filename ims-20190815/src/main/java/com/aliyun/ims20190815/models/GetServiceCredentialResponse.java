// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetServiceCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceCredentialResponseBody body;

    public static GetServiceCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceCredentialResponse self = new GetServiceCredentialResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceCredentialResponse setBody(GetServiceCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceCredentialResponseBody getBody() {
        return this.body;
    }

}
