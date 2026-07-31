// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UploadSemanticFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadSemanticFileResponseBody body;

    public static UploadSemanticFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadSemanticFileResponse self = new UploadSemanticFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadSemanticFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadSemanticFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadSemanticFileResponse setBody(UploadSemanticFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadSemanticFileResponseBody getBody() {
        return this.body;
    }

}
