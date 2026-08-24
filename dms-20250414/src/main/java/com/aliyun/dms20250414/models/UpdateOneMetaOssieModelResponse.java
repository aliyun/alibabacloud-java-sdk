// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateOneMetaOssieModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOneMetaOssieModelResponseBody body;

    public static UpdateOneMetaOssieModelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOneMetaOssieModelResponse self = new UpdateOneMetaOssieModelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOneMetaOssieModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOneMetaOssieModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOneMetaOssieModelResponse setBody(UpdateOneMetaOssieModelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOneMetaOssieModelResponseBody getBody() {
        return this.body;
    }

}
