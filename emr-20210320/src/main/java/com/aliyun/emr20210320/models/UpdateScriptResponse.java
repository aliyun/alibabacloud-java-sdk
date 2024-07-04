// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateScriptResponseBody body;

    public static UpdateScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScriptResponse self = new UpdateScriptResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateScriptResponse setBody(UpdateScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScriptResponseBody getBody() {
        return this.body;
    }

}
