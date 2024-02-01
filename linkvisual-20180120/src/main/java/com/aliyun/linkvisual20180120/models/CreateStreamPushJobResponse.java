// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateStreamPushJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStreamPushJobResponseBody body;

    public static CreateStreamPushJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamPushJobResponse self = new CreateStreamPushJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateStreamPushJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStreamPushJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStreamPushJobResponse setBody(CreateStreamPushJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStreamPushJobResponseBody getBody() {
        return this.body;
    }

}
