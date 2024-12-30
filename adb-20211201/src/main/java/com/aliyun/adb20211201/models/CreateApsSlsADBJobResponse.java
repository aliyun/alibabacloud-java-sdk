// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateApsSlsADBJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApsSlsADBJobResponseBody body;

    public static CreateApsSlsADBJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApsSlsADBJobResponse self = new CreateApsSlsADBJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateApsSlsADBJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApsSlsADBJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApsSlsADBJobResponse setBody(CreateApsSlsADBJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApsSlsADBJobResponseBody getBody() {
        return this.body;
    }

}
