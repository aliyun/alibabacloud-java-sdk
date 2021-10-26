// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutProvisionConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutProvisionConfigResponseBody body;

    public static PutProvisionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PutProvisionConfigResponse self = new PutProvisionConfigResponse();
        return TeaModel.build(map, self);
    }

    public PutProvisionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutProvisionConfigResponse setBody(PutProvisionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public PutProvisionConfigResponseBody getBody() {
        return this.body;
    }

}
