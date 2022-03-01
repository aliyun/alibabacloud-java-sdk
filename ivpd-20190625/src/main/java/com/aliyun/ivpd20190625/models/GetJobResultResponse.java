// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class GetJobResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJobResultResponseBody body;

    public static GetJobResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobResultResponse self = new GetJobResultResponse();
        return TeaModel.build(map, self);
    }

    public GetJobResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobResultResponse setBody(GetJobResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobResultResponseBody getBody() {
        return this.body;
    }

}
