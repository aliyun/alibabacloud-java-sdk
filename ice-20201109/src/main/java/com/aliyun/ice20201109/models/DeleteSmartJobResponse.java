// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteSmartJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSmartJobResponseBody body;

    public static DeleteSmartJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmartJobResponse self = new DeleteSmartJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSmartJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSmartJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSmartJobResponse setBody(DeleteSmartJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSmartJobResponseBody getBody() {
        return this.body;
    }

}
