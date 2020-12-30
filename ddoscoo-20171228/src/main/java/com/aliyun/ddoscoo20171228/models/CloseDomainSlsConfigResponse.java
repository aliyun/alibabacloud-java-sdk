// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class CloseDomainSlsConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloseDomainSlsConfigResponseBody body;

    public static CloseDomainSlsConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseDomainSlsConfigResponse self = new CloseDomainSlsConfigResponse();
        return TeaModel.build(map, self);
    }

    public CloseDomainSlsConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseDomainSlsConfigResponse setBody(CloseDomainSlsConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseDomainSlsConfigResponseBody getBody() {
        return this.body;
    }

}
