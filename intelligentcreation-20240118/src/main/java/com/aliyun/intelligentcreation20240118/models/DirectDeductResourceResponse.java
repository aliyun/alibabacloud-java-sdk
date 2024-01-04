// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class DirectDeductResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DirectDeductResourceResult body;

    public static DirectDeductResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DirectDeductResourceResponse self = new DirectDeductResourceResponse();
        return TeaModel.build(map, self);
    }

    public DirectDeductResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DirectDeductResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DirectDeductResourceResponse setBody(DirectDeductResourceResult body) {
        this.body = body;
        return this;
    }
    public DirectDeductResourceResult getBody() {
        return this.body;
    }

}
