// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class GetPrivateIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPrivateIpResponseBody body;

    public static GetPrivateIpResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrivateIpResponse self = new GetPrivateIpResponse();
        return TeaModel.build(map, self);
    }

    public GetPrivateIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPrivateIpResponse setBody(GetPrivateIpResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPrivateIpResponseBody getBody() {
        return this.body;
    }

}
