// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateUploadOSSFileJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUploadOSSFileJobResponseBody body;

    public static CreateUploadOSSFileJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadOSSFileJobResponse self = new CreateUploadOSSFileJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateUploadOSSFileJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUploadOSSFileJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUploadOSSFileJobResponse setBody(CreateUploadOSSFileJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUploadOSSFileJobResponseBody getBody() {
        return this.body;
    }

}
