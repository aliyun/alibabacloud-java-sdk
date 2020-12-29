// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class SynchronizeFabricChaincodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SynchronizeFabricChaincodeResponseBody body;

    public static SynchronizeFabricChaincodeResponse build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeFabricChaincodeResponse self = new SynchronizeFabricChaincodeResponse();
        return TeaModel.build(map, self);
    }

    public SynchronizeFabricChaincodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SynchronizeFabricChaincodeResponse setBody(SynchronizeFabricChaincodeResponseBody body) {
        this.body = body;
        return this;
    }
    public SynchronizeFabricChaincodeResponseBody getBody() {
        return this.body;
    }

}
