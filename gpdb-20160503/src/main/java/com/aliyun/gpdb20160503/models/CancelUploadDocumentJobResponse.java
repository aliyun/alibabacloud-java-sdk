// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CancelUploadDocumentJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelUploadDocumentJobResponseBody body;

    public static CancelUploadDocumentJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelUploadDocumentJobResponse self = new CancelUploadDocumentJobResponse();
        return TeaModel.build(map, self);
    }

    public CancelUploadDocumentJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelUploadDocumentJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelUploadDocumentJobResponse setBody(CancelUploadDocumentJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelUploadDocumentJobResponseBody getBody() {
        return this.body;
    }

}
