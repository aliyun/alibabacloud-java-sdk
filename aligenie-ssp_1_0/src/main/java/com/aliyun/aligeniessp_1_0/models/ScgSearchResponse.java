// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ScgSearchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ScgSearchResponseBody body;

    public static ScgSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        ScgSearchResponse self = new ScgSearchResponse();
        return TeaModel.build(map, self);
    }

    public ScgSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScgSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScgSearchResponse setBody(ScgSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public ScgSearchResponseBody getBody() {
        return this.body;
    }

}
