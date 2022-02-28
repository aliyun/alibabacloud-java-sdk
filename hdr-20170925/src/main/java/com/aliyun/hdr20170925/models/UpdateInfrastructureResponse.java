// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateInfrastructureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInfrastructureResponseBody body;

    public static UpdateInfrastructureResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInfrastructureResponse self = new UpdateInfrastructureResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInfrastructureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInfrastructureResponse setBody(UpdateInfrastructureResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInfrastructureResponseBody getBody() {
        return this.body;
    }

}
