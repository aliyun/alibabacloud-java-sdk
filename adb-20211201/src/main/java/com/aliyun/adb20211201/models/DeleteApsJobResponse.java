// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteApsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApsJobResponseBody body;

    public static DeleteApsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApsJobResponse self = new DeleteApsJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApsJobResponse setBody(DeleteApsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApsJobResponseBody getBody() {
        return this.body;
    }

}
