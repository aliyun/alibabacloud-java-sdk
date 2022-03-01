// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpgradeFabricChaincodeDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeFabricChaincodeDefinitionResponseBody body;

    public static UpgradeFabricChaincodeDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeFabricChaincodeDefinitionResponse self = new UpgradeFabricChaincodeDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeFabricChaincodeDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeFabricChaincodeDefinitionResponse setBody(UpgradeFabricChaincodeDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeFabricChaincodeDefinitionResponseBody getBody() {
        return this.body;
    }

}
