// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CalcPlanJsonResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CalcPlanJsonResourceResponseBody body;

    public static CalcPlanJsonResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CalcPlanJsonResourceResponse self = new CalcPlanJsonResourceResponse();
        return TeaModel.build(map, self);
    }

    public CalcPlanJsonResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CalcPlanJsonResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CalcPlanJsonResourceResponse setBody(CalcPlanJsonResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CalcPlanJsonResourceResponseBody getBody() {
        return this.body;
    }

}
