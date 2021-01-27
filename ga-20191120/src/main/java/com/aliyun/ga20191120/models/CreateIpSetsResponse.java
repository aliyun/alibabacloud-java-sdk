// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateIpSetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIpSetsResponseBody body;

    public static CreateIpSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpSetsResponse self = new CreateIpSetsResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIpSetsResponse setBody(CreateIpSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIpSetsResponseBody getBody() {
        return this.body;
    }

}
