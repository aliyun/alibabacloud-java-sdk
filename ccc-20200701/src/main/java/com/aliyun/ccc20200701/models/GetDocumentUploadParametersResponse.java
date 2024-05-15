// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetDocumentUploadParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocumentUploadParametersResponseBody body;

    public static GetDocumentUploadParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentUploadParametersResponse self = new GetDocumentUploadParametersResponse();
        return TeaModel.build(map, self);
    }

    public GetDocumentUploadParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocumentUploadParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocumentUploadParametersResponse setBody(GetDocumentUploadParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocumentUploadParametersResponseBody getBody() {
        return this.body;
    }

}
