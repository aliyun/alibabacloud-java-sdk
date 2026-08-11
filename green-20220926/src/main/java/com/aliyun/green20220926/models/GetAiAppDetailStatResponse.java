// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppDetailStatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAiAppDetailStatResponseBody body;

    public static GetAiAppDetailStatResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppDetailStatResponse self = new GetAiAppDetailStatResponse();
        return TeaModel.build(map, self);
    }

    public GetAiAppDetailStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiAppDetailStatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiAppDetailStatResponse setBody(GetAiAppDetailStatResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiAppDetailStatResponseBody getBody() {
        return this.body;
    }

}
