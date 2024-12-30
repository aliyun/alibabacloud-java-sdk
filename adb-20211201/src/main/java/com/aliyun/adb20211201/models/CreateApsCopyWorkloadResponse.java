// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateApsCopyWorkloadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApsCopyWorkloadResponseBody body;

    public static CreateApsCopyWorkloadResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApsCopyWorkloadResponse self = new CreateApsCopyWorkloadResponse();
        return TeaModel.build(map, self);
    }

    public CreateApsCopyWorkloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApsCopyWorkloadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApsCopyWorkloadResponse setBody(CreateApsCopyWorkloadResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApsCopyWorkloadResponseBody getBody() {
        return this.body;
    }

}
