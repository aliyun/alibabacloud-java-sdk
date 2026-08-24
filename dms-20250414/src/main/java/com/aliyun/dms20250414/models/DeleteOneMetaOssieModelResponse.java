// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteOneMetaOssieModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOneMetaOssieModelResponseBody body;

    public static DeleteOneMetaOssieModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOneMetaOssieModelResponse self = new DeleteOneMetaOssieModelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOneMetaOssieModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOneMetaOssieModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOneMetaOssieModelResponse setBody(DeleteOneMetaOssieModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOneMetaOssieModelResponseBody getBody() {
        return this.body;
    }

}
