// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateSceneModelApplyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSceneModelApplyResponseBody body;

    public static UpdateSceneModelApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneModelApplyResponse self = new UpdateSceneModelApplyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSceneModelApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSceneModelApplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSceneModelApplyResponse setBody(UpdateSceneModelApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSceneModelApplyResponseBody getBody() {
        return this.body;
    }

}
