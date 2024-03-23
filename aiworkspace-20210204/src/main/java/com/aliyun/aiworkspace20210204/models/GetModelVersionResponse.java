// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetModelVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetModelVersionResponseBody body;

    public static GetModelVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelVersionResponse self = new GetModelVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetModelVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelVersionResponse setBody(GetModelVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelVersionResponseBody getBody() {
        return this.body;
    }

}
