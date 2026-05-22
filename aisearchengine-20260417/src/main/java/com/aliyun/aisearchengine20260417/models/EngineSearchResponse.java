// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearchengine20260417.models;

import com.aliyun.tea.*;

public class EngineSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EngineSearchResponseBody body;

    public static EngineSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        EngineSearchResponse self = new EngineSearchResponse();
        return TeaModel.build(map, self);
    }

    public EngineSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EngineSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EngineSearchResponse setBody(EngineSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public EngineSearchResponseBody getBody() {
        return this.body;
    }

}
