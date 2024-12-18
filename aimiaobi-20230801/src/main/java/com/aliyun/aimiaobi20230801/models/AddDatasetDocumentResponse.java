// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AddDatasetDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDatasetDocumentResponseBody body;

    public static AddDatasetDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDatasetDocumentResponse self = new AddDatasetDocumentResponse();
        return TeaModel.build(map, self);
    }

    public AddDatasetDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDatasetDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDatasetDocumentResponse setBody(AddDatasetDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDatasetDocumentResponseBody getBody() {
        return this.body;
    }

}
