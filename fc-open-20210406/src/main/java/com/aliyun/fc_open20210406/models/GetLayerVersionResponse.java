// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetLayerVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Layer body;

    public static GetLayerVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLayerVersionResponse self = new GetLayerVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetLayerVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLayerVersionResponse setBody(Layer body) {
        this.body = body;
        return this;
    }
    public Layer getBody() {
        return this.body;
    }

}
