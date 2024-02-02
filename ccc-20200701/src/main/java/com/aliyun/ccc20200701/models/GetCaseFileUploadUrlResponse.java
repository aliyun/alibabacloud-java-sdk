// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetCaseFileUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCaseFileUploadUrlResponseBody body;

    public static GetCaseFileUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCaseFileUploadUrlResponse self = new GetCaseFileUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetCaseFileUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCaseFileUploadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCaseFileUploadUrlResponse setBody(GetCaseFileUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCaseFileUploadUrlResponseBody getBody() {
        return this.body;
    }

}
