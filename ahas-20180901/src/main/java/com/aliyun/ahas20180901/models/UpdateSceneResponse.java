// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSceneResponseBody body;

    public static UpdateSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneResponse self = new UpdateSceneResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSceneResponse setBody(UpdateSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSceneResponseBody getBody() {
        return this.body;
    }

}
