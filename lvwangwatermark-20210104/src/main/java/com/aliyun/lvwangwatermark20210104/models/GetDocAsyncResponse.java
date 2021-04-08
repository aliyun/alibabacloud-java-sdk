// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetDocAsyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDocAsyncResponseBody body;

    public static GetDocAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocAsyncResponse self = new GetDocAsyncResponse();
        return TeaModel.build(map, self);
    }

    public GetDocAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocAsyncResponse setBody(GetDocAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocAsyncResponseBody getBody() {
        return this.body;
    }

}
