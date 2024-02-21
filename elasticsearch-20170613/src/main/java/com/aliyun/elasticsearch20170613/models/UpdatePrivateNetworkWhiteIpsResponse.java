// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePrivateNetworkWhiteIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdatePrivateNetworkWhiteIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePrivateNetworkWhiteIpsResponse setBody(UpdatePrivateNetworkWhiteIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrivateNetworkWhiteIpsResponseBody getBody() {
        return this.body;
    }

}
