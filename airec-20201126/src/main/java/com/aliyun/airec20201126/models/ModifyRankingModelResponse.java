// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyRankingModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRankingModelResponseBody body;

    public static ModifyRankingModelResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRankingModelResponse self = new ModifyRankingModelResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRankingModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRankingModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRankingModelResponse setBody(ModifyRankingModelResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRankingModelResponseBody getBody() {
        return this.body;
    }

}
