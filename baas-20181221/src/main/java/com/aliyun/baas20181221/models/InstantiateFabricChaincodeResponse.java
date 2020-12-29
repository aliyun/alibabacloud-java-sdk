// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class InstantiateFabricChaincodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InstantiateFabricChaincodeResponseBody body;

    public static InstantiateFabricChaincodeResponse build(java.util.Map<String, ?> map) throws Exception {
        InstantiateFabricChaincodeResponse self = new InstantiateFabricChaincodeResponse();
        return TeaModel.build(map, self);
    }

    public InstantiateFabricChaincodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstantiateFabricChaincodeResponse setBody(InstantiateFabricChaincodeResponseBody body) {
        this.body = body;
        return this;
    }
    public InstantiateFabricChaincodeResponseBody getBody() {
        return this.body;
    }

}
