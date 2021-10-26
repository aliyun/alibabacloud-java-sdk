// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetLayerVersionByArnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLayerVersionByArnResponseBody body;

    public static GetLayerVersionByArnResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLayerVersionByArnResponse self = new GetLayerVersionByArnResponse();
        return TeaModel.build(map, self);
    }

    public GetLayerVersionByArnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLayerVersionByArnResponse setBody(GetLayerVersionByArnResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLayerVersionByArnResponseBody getBody() {
        return this.body;
    }

}
