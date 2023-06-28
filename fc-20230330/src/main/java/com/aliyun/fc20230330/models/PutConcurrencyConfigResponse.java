// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutConcurrencyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConcurrencyConfig body;

    public static PutConcurrencyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PutConcurrencyConfigResponse self = new PutConcurrencyConfigResponse();
        return TeaModel.build(map, self);
    }

    public PutConcurrencyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutConcurrencyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutConcurrencyConfigResponse setBody(ConcurrencyConfig body) {
        this.body = body;
        return this;
    }
    public ConcurrencyConfig getBody() {
        return this.body;
    }

}
