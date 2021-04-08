// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetQueryTraceFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetQueryTraceFileResponseBody body;

    public static GetQueryTraceFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueryTraceFileResponse self = new GetQueryTraceFileResponse();
        return TeaModel.build(map, self);
    }

    public GetQueryTraceFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueryTraceFileResponse setBody(GetQueryTraceFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueryTraceFileResponseBody getBody() {
        return this.body;
    }

}
