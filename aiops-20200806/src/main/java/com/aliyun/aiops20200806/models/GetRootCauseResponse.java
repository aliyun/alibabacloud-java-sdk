// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRootCauseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRootCauseResponseBody body;

    public static GetRootCauseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRootCauseResponse self = new GetRootCauseResponse();
        return TeaModel.build(map, self);
    }

    public GetRootCauseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRootCauseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRootCauseResponse setBody(GetRootCauseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRootCauseResponseBody getBody() {
        return this.body;
    }

}
