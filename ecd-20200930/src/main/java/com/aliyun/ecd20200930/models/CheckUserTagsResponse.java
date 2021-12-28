// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CheckUserTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckUserTagsResponseBody body;

    public static CheckUserTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUserTagsResponse self = new CheckUserTagsResponse();
        return TeaModel.build(map, self);
    }

    public CheckUserTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUserTagsResponse setBody(CheckUserTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUserTagsResponseBody getBody() {
        return this.body;
    }

}
