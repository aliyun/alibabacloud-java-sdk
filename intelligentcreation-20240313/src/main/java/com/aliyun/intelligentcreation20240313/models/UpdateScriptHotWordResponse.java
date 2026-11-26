// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class UpdateScriptHotWordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateScriptHotWordResponseBody body;

    public static UpdateScriptHotWordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScriptHotWordResponse self = new UpdateScriptHotWordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScriptHotWordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScriptHotWordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateScriptHotWordResponse setBody(UpdateScriptHotWordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScriptHotWordResponseBody getBody() {
        return this.body;
    }

}
