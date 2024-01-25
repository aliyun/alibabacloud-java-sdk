// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetScriptEventRootCauseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScriptEventRootCauseResponseBody body;

    public static GetScriptEventRootCauseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScriptEventRootCauseResponse self = new GetScriptEventRootCauseResponse();
        return TeaModel.build(map, self);
    }

    public GetScriptEventRootCauseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScriptEventRootCauseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScriptEventRootCauseResponse setBody(GetScriptEventRootCauseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScriptEventRootCauseResponseBody getBody() {
        return this.body;
    }

}
