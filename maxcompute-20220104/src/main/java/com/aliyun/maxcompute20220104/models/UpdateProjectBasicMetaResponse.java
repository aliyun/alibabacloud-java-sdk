// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateProjectBasicMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProjectBasicMetaResponseBody body;

    public static UpdateProjectBasicMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectBasicMetaResponse self = new UpdateProjectBasicMetaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProjectBasicMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProjectBasicMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProjectBasicMetaResponse setBody(UpdateProjectBasicMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProjectBasicMetaResponseBody getBody() {
        return this.body;
    }

}
