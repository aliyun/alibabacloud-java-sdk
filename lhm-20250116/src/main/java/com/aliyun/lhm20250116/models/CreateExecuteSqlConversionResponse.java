// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class CreateExecuteSqlConversionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExecuteSqlConversionResponseBody body;

    public static CreateExecuteSqlConversionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExecuteSqlConversionResponse self = new CreateExecuteSqlConversionResponse();
        return TeaModel.build(map, self);
    }

    public CreateExecuteSqlConversionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExecuteSqlConversionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExecuteSqlConversionResponse setBody(CreateExecuteSqlConversionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExecuteSqlConversionResponseBody getBody() {
        return this.body;
    }

}
