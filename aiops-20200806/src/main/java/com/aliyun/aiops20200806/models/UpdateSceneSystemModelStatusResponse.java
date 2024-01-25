// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateSceneSystemModelStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSceneSystemModelStatusResponseBody body;

    public static UpdateSceneSystemModelStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneSystemModelStatusResponse self = new UpdateSceneSystemModelStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSceneSystemModelStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSceneSystemModelStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSceneSystemModelStatusResponse setBody(UpdateSceneSystemModelStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSceneSystemModelStatusResponseBody getBody() {
        return this.body;
    }

}
