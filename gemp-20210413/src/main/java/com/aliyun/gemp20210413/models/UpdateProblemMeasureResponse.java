// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemMeasureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProblemMeasureResponseBody body;

    public static UpdateProblemMeasureResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemMeasureResponse self = new UpdateProblemMeasureResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProblemMeasureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProblemMeasureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProblemMeasureResponse setBody(UpdateProblemMeasureResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProblemMeasureResponseBody getBody() {
        return this.body;
    }

}
