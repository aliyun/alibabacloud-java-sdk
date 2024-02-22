// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostEventDisposeAndWhiteruleListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PostEventDisposeAndWhiteruleListResponseBody body;

    public static PostEventDisposeAndWhiteruleListResponse build(java.util.Map<String, ?> map) throws Exception {
        PostEventDisposeAndWhiteruleListResponse self = new PostEventDisposeAndWhiteruleListResponse();
        return TeaModel.build(map, self);
    }

    public PostEventDisposeAndWhiteruleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PostEventDisposeAndWhiteruleListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PostEventDisposeAndWhiteruleListResponse setBody(PostEventDisposeAndWhiteruleListResponseBody body) {
        this.body = body;
        return this;
    }
    public PostEventDisposeAndWhiteruleListResponseBody getBody() {
        return this.body;
    }

}
