// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateUploadFileJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUploadFileJobResponseBody body;

    public static CreateUploadFileJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadFileJobResponse self = new CreateUploadFileJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateUploadFileJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUploadFileJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUploadFileJobResponse setBody(CreateUploadFileJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUploadFileJobResponseBody getBody() {
        return this.body;
    }

}
