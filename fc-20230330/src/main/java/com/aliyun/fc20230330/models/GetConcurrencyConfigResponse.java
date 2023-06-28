// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GetConcurrencyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConcurrencyConfig body;

    public static GetConcurrencyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConcurrencyConfigResponse self = new GetConcurrencyConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetConcurrencyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConcurrencyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConcurrencyConfigResponse setBody(ConcurrencyConfig body) {
        this.body = body;
        return this;
    }
    public ConcurrencyConfig getBody() {
        return this.body;
    }

}
