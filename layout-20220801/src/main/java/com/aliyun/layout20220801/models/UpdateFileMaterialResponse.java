// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class UpdateFileMaterialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFileMaterialResponseBody body;

    public static UpdateFileMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileMaterialResponse self = new UpdateFileMaterialResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFileMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFileMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFileMaterialResponse setBody(UpdateFileMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFileMaterialResponseBody getBody() {
        return this.body;
    }

}
