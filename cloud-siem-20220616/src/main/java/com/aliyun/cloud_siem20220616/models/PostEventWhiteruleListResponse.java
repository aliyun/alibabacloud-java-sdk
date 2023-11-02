// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostEventWhiteruleListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PostEventWhiteruleListResponseBody body;

    public static PostEventWhiteruleListResponse build(java.util.Map<String, ?> map) throws Exception {
        PostEventWhiteruleListResponse self = new PostEventWhiteruleListResponse();
        return TeaModel.build(map, self);
    }

    public PostEventWhiteruleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PostEventWhiteruleListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PostEventWhiteruleListResponse setBody(PostEventWhiteruleListResponseBody body) {
        this.body = body;
        return this;
    }
    public PostEventWhiteruleListResponseBody getBody() {
        return this.body;
    }

}
