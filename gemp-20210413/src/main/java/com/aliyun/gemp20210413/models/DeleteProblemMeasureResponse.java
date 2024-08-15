// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteProblemMeasureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProblemMeasureResponseBody body;

    public static DeleteProblemMeasureResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProblemMeasureResponse self = new DeleteProblemMeasureResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProblemMeasureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProblemMeasureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProblemMeasureResponse setBody(DeleteProblemMeasureResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProblemMeasureResponseBody getBody() {
        return this.body;
    }

}
