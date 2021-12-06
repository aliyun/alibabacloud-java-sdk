// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetDirectorySAMLServiceProviderInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDirectorySAMLServiceProviderInfoResponseBody body;

    public static GetDirectorySAMLServiceProviderInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDirectorySAMLServiceProviderInfoResponse self = new GetDirectorySAMLServiceProviderInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDirectorySAMLServiceProviderInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDirectorySAMLServiceProviderInfoResponse setBody(GetDirectorySAMLServiceProviderInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDirectorySAMLServiceProviderInfoResponseBody getBody() {
        return this.body;
    }

}
