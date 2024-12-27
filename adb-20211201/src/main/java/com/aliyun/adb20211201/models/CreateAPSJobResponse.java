// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateAPSJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAPSJobResponseBody body;

    public static CreateAPSJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAPSJobResponse self = new CreateAPSJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateAPSJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAPSJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAPSJobResponse setBody(CreateAPSJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAPSJobResponseBody getBody() {
        return this.body;
    }

}
