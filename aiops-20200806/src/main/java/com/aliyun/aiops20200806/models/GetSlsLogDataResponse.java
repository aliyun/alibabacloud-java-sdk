// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetSlsLogDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSlsLogDataResponseBody body;

    public static GetSlsLogDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSlsLogDataResponse self = new GetSlsLogDataResponse();
        return TeaModel.build(map, self);
    }

    public GetSlsLogDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSlsLogDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSlsLogDataResponse setBody(GetSlsLogDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSlsLogDataResponseBody getBody() {
        return this.body;
    }

}
