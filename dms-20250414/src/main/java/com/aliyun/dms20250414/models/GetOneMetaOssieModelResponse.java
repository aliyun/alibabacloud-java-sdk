// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetOneMetaOssieModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOneMetaOssieModelResponseBody body;

    public static GetOneMetaOssieModelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOneMetaOssieModelResponse self = new GetOneMetaOssieModelResponse();
        return TeaModel.build(map, self);
    }

    public GetOneMetaOssieModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOneMetaOssieModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOneMetaOssieModelResponse setBody(GetOneMetaOssieModelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOneMetaOssieModelResponseBody getBody() {
        return this.body;
    }

}
