// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class CompleteAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CompleteAppResponseBody body;

    public static CompleteAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteAppResponse self = new CompleteAppResponse();
        return TeaModel.build(map, self);
    }

    public CompleteAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompleteAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompleteAppResponse setBody(CompleteAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CompleteAppResponseBody getBody() {
        return this.body;
    }

}
