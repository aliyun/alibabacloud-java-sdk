// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateLayerVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLayerVersionResponseBody body;

    public static CreateLayerVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLayerVersionResponse self = new CreateLayerVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateLayerVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLayerVersionResponse setBody(CreateLayerVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLayerVersionResponseBody getBody() {
        return this.body;
    }

}
