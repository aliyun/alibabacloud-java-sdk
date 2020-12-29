// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpgradeFabricChaincodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeFabricChaincodeResponseBody body;

    public static UpgradeFabricChaincodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeFabricChaincodeResponse self = new UpgradeFabricChaincodeResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeFabricChaincodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeFabricChaincodeResponse setBody(UpgradeFabricChaincodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeFabricChaincodeResponseBody getBody() {
        return this.body;
    }

}
