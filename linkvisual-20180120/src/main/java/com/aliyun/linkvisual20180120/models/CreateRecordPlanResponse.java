// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateRecordPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRecordPlanResponseBody body;

    public static CreateRecordPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRecordPlanResponse self = new CreateRecordPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateRecordPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRecordPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRecordPlanResponse setBody(CreateRecordPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRecordPlanResponseBody getBody() {
        return this.body;
    }

}
