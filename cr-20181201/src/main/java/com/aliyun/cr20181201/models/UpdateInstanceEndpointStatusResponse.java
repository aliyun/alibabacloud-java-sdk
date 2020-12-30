// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateInstanceEndpointStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInstanceEndpointStatusResponseBody body;

    public static UpdateInstanceEndpointStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceEndpointStatusResponse self = new UpdateInstanceEndpointStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceEndpointStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceEndpointStatusResponse setBody(UpdateInstanceEndpointStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceEndpointStatusResponseBody getBody() {
        return this.body;
    }

}
