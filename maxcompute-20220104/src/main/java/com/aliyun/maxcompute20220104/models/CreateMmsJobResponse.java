// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateMmsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMmsJobResponseBody body;

    public static CreateMmsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMmsJobResponse self = new CreateMmsJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateMmsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMmsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMmsJobResponse setBody(CreateMmsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMmsJobResponseBody getBody() {
        return this.body;
    }

}
