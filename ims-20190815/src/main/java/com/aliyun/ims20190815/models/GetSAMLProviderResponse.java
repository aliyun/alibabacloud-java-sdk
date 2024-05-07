// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetSAMLProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSAMLProviderResponseBody body;

    public static GetSAMLProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSAMLProviderResponse self = new GetSAMLProviderResponse();
        return TeaModel.build(map, self);
    }

    public GetSAMLProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSAMLProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSAMLProviderResponse setBody(GetSAMLProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSAMLProviderResponseBody getBody() {
        return this.body;
    }

}
