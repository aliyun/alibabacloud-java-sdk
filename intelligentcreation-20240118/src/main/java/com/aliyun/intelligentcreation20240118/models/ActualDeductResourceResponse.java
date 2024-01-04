// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class ActualDeductResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ActualDeductResourceResult body;

    public static ActualDeductResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ActualDeductResourceResponse self = new ActualDeductResourceResponse();
        return TeaModel.build(map, self);
    }

    public ActualDeductResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActualDeductResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActualDeductResourceResponse setBody(ActualDeductResourceResult body) {
        this.body = body;
        return this;
    }
    public ActualDeductResourceResult getBody() {
        return this.body;
    }

}
