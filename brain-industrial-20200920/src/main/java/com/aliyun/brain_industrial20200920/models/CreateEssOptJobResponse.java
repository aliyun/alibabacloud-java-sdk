// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreateEssOptJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEssOptJobResponseBody body;

    public static CreateEssOptJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEssOptJobResponse self = new CreateEssOptJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateEssOptJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEssOptJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEssOptJobResponse setBody(CreateEssOptJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEssOptJobResponseBody getBody() {
        return this.body;
    }

}
