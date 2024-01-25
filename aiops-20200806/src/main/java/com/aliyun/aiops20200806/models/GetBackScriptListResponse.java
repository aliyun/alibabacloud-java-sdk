// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBackScriptListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBackScriptListResponseBody body;

    public static GetBackScriptListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBackScriptListResponse self = new GetBackScriptListResponse();
        return TeaModel.build(map, self);
    }

    public GetBackScriptListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBackScriptListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBackScriptListResponse setBody(GetBackScriptListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBackScriptListResponseBody getBody() {
        return this.body;
    }

}
