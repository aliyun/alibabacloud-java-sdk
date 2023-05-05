// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class UpdateAppMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppMetaResponseBody body;

    public static UpdateAppMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppMetaResponse self = new UpdateAppMetaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppMetaResponse setBody(UpdateAppMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppMetaResponseBody getBody() {
        return this.body;
    }

}
