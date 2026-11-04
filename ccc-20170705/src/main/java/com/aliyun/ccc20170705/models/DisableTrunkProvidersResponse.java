// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DisableTrunkProvidersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableTrunkProvidersResponseBody body;

    public static DisableTrunkProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableTrunkProvidersResponse self = new DisableTrunkProvidersResponse();
        return TeaModel.build(map, self);
    }

    public DisableTrunkProvidersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableTrunkProvidersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableTrunkProvidersResponse setBody(DisableTrunkProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableTrunkProvidersResponseBody getBody() {
        return this.body;
    }

}
