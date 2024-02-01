// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteLocalFileUploadJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLocalFileUploadJobResponseBody body;

    public static DeleteLocalFileUploadJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLocalFileUploadJobResponse self = new DeleteLocalFileUploadJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLocalFileUploadJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLocalFileUploadJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLocalFileUploadJobResponse setBody(DeleteLocalFileUploadJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLocalFileUploadJobResponseBody getBody() {
        return this.body;
    }

}
