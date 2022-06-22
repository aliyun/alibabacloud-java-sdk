// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CreateInspectJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInspectJobResponseBody body;

    public static CreateInspectJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInspectJobResponse self = new CreateInspectJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateInspectJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInspectJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInspectJobResponse setBody(CreateInspectJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInspectJobResponseBody getBody() {
        return this.body;
    }

}
