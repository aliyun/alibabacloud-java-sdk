// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetVideoTraceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVideoTraceResponseBody body;

    public static GetVideoTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoTraceResponse self = new GetVideoTraceResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoTraceResponse setBody(GetVideoTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoTraceResponseBody getBody() {
        return this.body;
    }

}
