// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DisableTrunkProvidersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DisableTrunkProvidersResponse setBody(DisableTrunkProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableTrunkProvidersResponseBody getBody() {
        return this.body;
    }

}
