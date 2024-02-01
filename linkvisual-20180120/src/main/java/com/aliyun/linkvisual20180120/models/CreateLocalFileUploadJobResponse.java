// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateLocalFileUploadJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLocalFileUploadJobResponseBody body;

    public static CreateLocalFileUploadJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLocalFileUploadJobResponse self = new CreateLocalFileUploadJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateLocalFileUploadJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLocalFileUploadJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLocalFileUploadJobResponse setBody(CreateLocalFileUploadJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLocalFileUploadJobResponseBody getBody() {
        return this.body;
    }

}
