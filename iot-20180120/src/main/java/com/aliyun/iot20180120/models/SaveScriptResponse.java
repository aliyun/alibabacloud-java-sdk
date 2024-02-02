// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SaveScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveScriptResponseBody body;

    public static SaveScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveScriptResponse self = new SaveScriptResponse();
        return TeaModel.build(map, self);
    }

    public SaveScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveScriptResponse setBody(SaveScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveScriptResponseBody getBody() {
        return this.body;
    }

}
