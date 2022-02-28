// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class AddInfrastructureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddInfrastructureResponseBody body;

    public static AddInfrastructureResponse build(java.util.Map<String, ?> map) throws Exception {
        AddInfrastructureResponse self = new AddInfrastructureResponse();
        return TeaModel.build(map, self);
    }

    public AddInfrastructureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddInfrastructureResponse setBody(AddInfrastructureResponseBody body) {
        this.body = body;
        return this;
    }
    public AddInfrastructureResponseBody getBody() {
        return this.body;
    }

}
