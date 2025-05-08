// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnifiedSearchOutput body;

    public static UnifiedSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        UnifiedSearchResponse self = new UnifiedSearchResponse();
        return TeaModel.build(map, self);
    }

    public UnifiedSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnifiedSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnifiedSearchResponse setBody(UnifiedSearchOutput body) {
        this.body = body;
        return this;
    }
    public UnifiedSearchOutput getBody() {
        return this.body;
    }

}
