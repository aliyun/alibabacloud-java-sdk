// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetCodeInterpreterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CodeInterpreterResult body;

    public static GetCodeInterpreterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCodeInterpreterResponse self = new GetCodeInterpreterResponse();
        return TeaModel.build(map, self);
    }

    public GetCodeInterpreterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCodeInterpreterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCodeInterpreterResponse setBody(CodeInterpreterResult body) {
        this.body = body;
        return this;
    }
    public CodeInterpreterResult getBody() {
        return this.body;
    }

}
