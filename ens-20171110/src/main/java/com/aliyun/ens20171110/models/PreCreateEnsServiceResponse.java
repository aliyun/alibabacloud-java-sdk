// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PreCreateEnsServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PreCreateEnsServiceResponseBody body;

    public static PreCreateEnsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        PreCreateEnsServiceResponse self = new PreCreateEnsServiceResponse();
        return TeaModel.build(map, self);
    }

    public PreCreateEnsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreCreateEnsServiceResponse setBody(PreCreateEnsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public PreCreateEnsServiceResponseBody getBody() {
        return this.body;
    }

}
