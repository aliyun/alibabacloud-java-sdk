// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskProgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAiOutboundTaskProgressResponseBody body;

    public static GetAiOutboundTaskProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskProgressResponse self = new GetAiOutboundTaskProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiOutboundTaskProgressResponse setBody(GetAiOutboundTaskProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiOutboundTaskProgressResponseBody getBody() {
        return this.body;
    }

}
