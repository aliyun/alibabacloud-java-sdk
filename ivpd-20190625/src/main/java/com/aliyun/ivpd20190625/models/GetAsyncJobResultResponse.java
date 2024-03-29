// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class GetAsyncJobResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAsyncJobResultResponseBody body;

    public static GetAsyncJobResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncJobResultResponse self = new GetAsyncJobResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAsyncJobResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAsyncJobResultResponse setBody(GetAsyncJobResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAsyncJobResultResponseBody getBody() {
        return this.body;
    }

}
