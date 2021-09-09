// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePrivateNetworkWhiteIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePrivateNetworkWhiteIpsResponseBody body;

    public static UpdatePrivateNetworkWhiteIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateNetworkWhiteIpsResponse self = new UpdatePrivateNetworkWhiteIpsResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateNetworkWhiteIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePrivateNetworkWhiteIpsResponse setBody(UpdatePrivateNetworkWhiteIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrivateNetworkWhiteIpsResponseBody getBody() {
        return this.body;
    }

}
