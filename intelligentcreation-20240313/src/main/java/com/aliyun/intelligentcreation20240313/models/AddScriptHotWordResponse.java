// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class AddScriptHotWordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddScriptHotWordResponseBody body;

    public static AddScriptHotWordResponse build(java.util.Map<String, ?> map) throws Exception {
        AddScriptHotWordResponse self = new AddScriptHotWordResponse();
        return TeaModel.build(map, self);
    }

    public AddScriptHotWordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddScriptHotWordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddScriptHotWordResponse setBody(AddScriptHotWordResponseBody body) {
        this.body = body;
        return this;
    }
    public AddScriptHotWordResponseBody getBody() {
        return this.body;
    }

}
