// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class EndScriptListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EndScriptListResponseBody body;

    public static EndScriptListResponse build(java.util.Map<String, ?> map) throws Exception {
        EndScriptListResponse self = new EndScriptListResponse();
        return TeaModel.build(map, self);
    }

    public EndScriptListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EndScriptListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EndScriptListResponse setBody(EndScriptListResponseBody body) {
        this.body = body;
        return this;
    }
    public EndScriptListResponseBody getBody() {
        return this.body;
    }

}
