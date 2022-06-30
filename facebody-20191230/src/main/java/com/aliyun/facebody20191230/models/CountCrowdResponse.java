// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CountCrowdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CountCrowdResponseBody body;

    public static CountCrowdResponse build(java.util.Map<String, ?> map) throws Exception {
        CountCrowdResponse self = new CountCrowdResponse();
        return TeaModel.build(map, self);
    }

    public CountCrowdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountCrowdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CountCrowdResponse setBody(CountCrowdResponseBody body) {
        this.body = body;
        return this;
    }
    public CountCrowdResponseBody getBody() {
        return this.body;
    }

}
