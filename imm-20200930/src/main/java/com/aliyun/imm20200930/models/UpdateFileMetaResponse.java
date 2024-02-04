// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateFileMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFileMetaResponseBody body;

    public static UpdateFileMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileMetaResponse self = new UpdateFileMetaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFileMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFileMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFileMetaResponse setBody(UpdateFileMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFileMetaResponseBody getBody() {
        return this.body;
    }

}
