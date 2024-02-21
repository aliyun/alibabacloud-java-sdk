// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RecommendTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RecommendTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecommendTemplatesResponse setBody(RecommendTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public RecommendTemplatesResponseBody getBody() {
        return this.body;
    }

}
