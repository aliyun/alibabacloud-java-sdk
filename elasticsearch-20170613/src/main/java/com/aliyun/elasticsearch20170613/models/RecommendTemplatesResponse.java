// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RecommendTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecommendTemplatesResponseBody body;

    public static RecommendTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        RecommendTemplatesResponse self = new RecommendTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public RecommendTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecommendTemplatesResponse setBody(RecommendTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public RecommendTemplatesResponseBody getBody() {
        return this.body;
    }

}
