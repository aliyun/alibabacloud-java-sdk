// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetBatchTaskProgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBatchTaskProgressResponseBody body;

    public static GetBatchTaskProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTaskProgressResponse self = new GetBatchTaskProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetBatchTaskProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBatchTaskProgressResponse setBody(GetBatchTaskProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBatchTaskProgressResponseBody getBody() {
        return this.body;
    }

}
