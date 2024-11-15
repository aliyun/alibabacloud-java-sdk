// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class AiSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AiSearchResponseBody body;

    public static AiSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        AiSearchResponse self = new AiSearchResponse();
        return TeaModel.build(map, self);
    }

    public AiSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AiSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AiSearchResponse setBody(AiSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public AiSearchResponseBody getBody() {
        return this.body;
    }

}
