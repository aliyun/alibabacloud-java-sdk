// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyRankingModelTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRankingModelTemplateResponseBody body;

    public static ModifyRankingModelTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRankingModelTemplateResponse self = new ModifyRankingModelTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRankingModelTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRankingModelTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRankingModelTemplateResponse setBody(ModifyRankingModelTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRankingModelTemplateResponseBody getBody() {
        return this.body;
    }

}
