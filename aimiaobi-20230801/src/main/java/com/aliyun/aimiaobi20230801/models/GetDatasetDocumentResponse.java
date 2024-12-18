// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDatasetDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDatasetDocumentResponseBody body;

    public static GetDatasetDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetDocumentResponse self = new GetDatasetDocumentResponse();
        return TeaModel.build(map, self);
    }

    public GetDatasetDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatasetDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDatasetDocumentResponse setBody(GetDatasetDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatasetDocumentResponseBody getBody() {
        return this.body;
    }

}
