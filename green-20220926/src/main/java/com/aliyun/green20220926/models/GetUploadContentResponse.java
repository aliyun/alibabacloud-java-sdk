// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetUploadContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUploadContentResponseBody body;

    public static GetUploadContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUploadContentResponse self = new GetUploadContentResponse();
        return TeaModel.build(map, self);
    }

    public GetUploadContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUploadContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUploadContentResponse setBody(GetUploadContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUploadContentResponseBody getBody() {
        return this.body;
    }

}
