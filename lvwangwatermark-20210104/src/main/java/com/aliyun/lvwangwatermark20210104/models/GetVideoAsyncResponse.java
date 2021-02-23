// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetVideoAsyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVideoAsyncResponseBody body;

    public static GetVideoAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoAsyncResponse self = new GetVideoAsyncResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoAsyncResponse setBody(GetVideoAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoAsyncResponseBody getBody() {
        return this.body;
    }

}
