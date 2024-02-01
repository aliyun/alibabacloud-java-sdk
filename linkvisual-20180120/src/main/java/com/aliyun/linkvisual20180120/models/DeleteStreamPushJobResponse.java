// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteStreamPushJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStreamPushJobResponseBody body;

    public static DeleteStreamPushJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamPushJobResponse self = new DeleteStreamPushJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStreamPushJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStreamPushJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStreamPushJobResponse setBody(DeleteStreamPushJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStreamPushJobResponseBody getBody() {
        return this.body;
    }

}
