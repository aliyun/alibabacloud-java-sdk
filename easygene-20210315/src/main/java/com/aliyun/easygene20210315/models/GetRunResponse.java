// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRunResponseBody body;

    public static GetRunResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRunResponse self = new GetRunResponse();
        return TeaModel.build(map, self);
    }

    public GetRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRunResponse setBody(GetRunResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRunResponseBody getBody() {
        return this.body;
    }

}
