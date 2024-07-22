// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetProjectTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProjectTaskResponseBody body;

    public static GetProjectTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectTaskResponse self = new GetProjectTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectTaskResponse setBody(GetProjectTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectTaskResponseBody getBody() {
        return this.body;
    }

}
