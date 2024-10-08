// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemMeasureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProblemMeasureResponseBody body;

    public static CreateProblemMeasureResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemMeasureResponse self = new CreateProblemMeasureResponse();
        return TeaModel.build(map, self);
    }

    public CreateProblemMeasureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProblemMeasureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProblemMeasureResponse setBody(CreateProblemMeasureResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProblemMeasureResponseBody getBody() {
        return this.body;
    }

}
