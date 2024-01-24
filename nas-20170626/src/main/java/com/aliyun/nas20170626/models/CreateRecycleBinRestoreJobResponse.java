// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateRecycleBinRestoreJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRecycleBinRestoreJobResponseBody body;

    public static CreateRecycleBinRestoreJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRecycleBinRestoreJobResponse self = new CreateRecycleBinRestoreJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateRecycleBinRestoreJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRecycleBinRestoreJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRecycleBinRestoreJobResponse setBody(CreateRecycleBinRestoreJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRecycleBinRestoreJobResponseBody getBody() {
        return this.body;
    }

}
