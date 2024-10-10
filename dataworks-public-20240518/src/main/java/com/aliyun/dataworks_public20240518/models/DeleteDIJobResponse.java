// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDIJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDIJobResponseBody body;

    public static DeleteDIJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDIJobResponse self = new DeleteDIJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDIJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDIJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDIJobResponse setBody(DeleteDIJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDIJobResponseBody getBody() {
        return this.body;
    }

}
