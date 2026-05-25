// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyStageModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyStageModelResponseBody body;

    public static ModifyStageModelResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyStageModelResponse self = new ModifyStageModelResponse();
        return TeaModel.build(map, self);
    }

    public ModifyStageModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyStageModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyStageModelResponse setBody(ModifyStageModelResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyStageModelResponseBody getBody() {
        return this.body;
    }

}
