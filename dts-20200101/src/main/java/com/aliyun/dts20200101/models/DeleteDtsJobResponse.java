// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DeleteDtsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDtsJobResponseBody body;

    public static DeleteDtsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDtsJobResponse self = new DeleteDtsJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDtsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDtsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDtsJobResponse setBody(DeleteDtsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDtsJobResponseBody getBody() {
        return this.body;
    }

}
