// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnassociateNetworkCidrBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnassociateNetworkCidrBlockResponseBody body;

    public static UnassociateNetworkCidrBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociateNetworkCidrBlockResponse self = new UnassociateNetworkCidrBlockResponse();
        return TeaModel.build(map, self);
    }

    public UnassociateNetworkCidrBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnassociateNetworkCidrBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnassociateNetworkCidrBlockResponse setBody(UnassociateNetworkCidrBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassociateNetworkCidrBlockResponseBody getBody() {
        return this.body;
    }

}
