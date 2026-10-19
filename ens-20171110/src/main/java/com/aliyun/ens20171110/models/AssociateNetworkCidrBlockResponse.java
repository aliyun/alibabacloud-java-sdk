// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AssociateNetworkCidrBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateNetworkCidrBlockResponseBody body;

    public static AssociateNetworkCidrBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateNetworkCidrBlockResponse self = new AssociateNetworkCidrBlockResponse();
        return TeaModel.build(map, self);
    }

    public AssociateNetworkCidrBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateNetworkCidrBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateNetworkCidrBlockResponse setBody(AssociateNetworkCidrBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateNetworkCidrBlockResponseBody getBody() {
        return this.body;
    }

}
