// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateRecycleBinDeleteJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRecycleBinDeleteJobResponseBody body;

    public static CreateRecycleBinDeleteJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRecycleBinDeleteJobResponse self = new CreateRecycleBinDeleteJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateRecycleBinDeleteJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRecycleBinDeleteJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRecycleBinDeleteJobResponse setBody(CreateRecycleBinDeleteJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRecycleBinDeleteJobResponseBody getBody() {
        return this.body;
    }

}
