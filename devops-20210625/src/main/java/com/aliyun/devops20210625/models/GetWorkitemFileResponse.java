// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkitemFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkitemFileResponseBody body;

    public static GetWorkitemFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkitemFileResponse self = new GetWorkitemFileResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkitemFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkitemFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkitemFileResponse setBody(GetWorkitemFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkitemFileResponseBody getBody() {
        return this.body;
    }

}
