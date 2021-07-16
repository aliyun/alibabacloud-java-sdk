// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteProblemMeasureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteProblemMeasureResponse setBody(DeleteProblemMeasureResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProblemMeasureResponseBody getBody() {
        return this.body;
    }

}
