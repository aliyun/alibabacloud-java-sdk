// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetCheckRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCheckRunResponseBody body;

    public static GetCheckRunResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCheckRunResponse self = new GetCheckRunResponse();
        return TeaModel.build(map, self);
    }

    public GetCheckRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCheckRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCheckRunResponse setBody(GetCheckRunResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCheckRunResponseBody getBody() {
        return this.body;
    }

}
