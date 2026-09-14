// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetUpdateTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUpdateTaskResultResponseBody body;

    public static GetUpdateTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUpdateTaskResultResponse self = new GetUpdateTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetUpdateTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUpdateTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUpdateTaskResultResponse setBody(GetUpdateTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUpdateTaskResultResponseBody getBody() {
        return this.body;
    }

}
