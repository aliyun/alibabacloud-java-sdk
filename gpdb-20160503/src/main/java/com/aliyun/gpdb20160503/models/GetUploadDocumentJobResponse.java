// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetUploadDocumentJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUploadDocumentJobResponseBody body;

    public static GetUploadDocumentJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUploadDocumentJobResponse self = new GetUploadDocumentJobResponse();
        return TeaModel.build(map, self);
    }

    public GetUploadDocumentJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUploadDocumentJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUploadDocumentJobResponse setBody(GetUploadDocumentJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUploadDocumentJobResponseBody getBody() {
        return this.body;
    }

}
