// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutFunctionOnDemandConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutFunctionOnDemandConfigResponseBody body;

    public static PutFunctionOnDemandConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PutFunctionOnDemandConfigResponse self = new PutFunctionOnDemandConfigResponse();
        return TeaModel.build(map, self);
    }

    public PutFunctionOnDemandConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutFunctionOnDemandConfigResponse setBody(PutFunctionOnDemandConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public PutFunctionOnDemandConfigResponseBody getBody() {
        return this.body;
    }

}
