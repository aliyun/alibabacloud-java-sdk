// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexPortsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFlexPortsResponseBody body;

    public static UpdateFlexPortsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexPortsResponse self = new UpdateFlexPortsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlexPortsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlexPortsResponse setBody(UpdateFlexPortsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFlexPortsResponseBody getBody() {
        return this.body;
    }

}
