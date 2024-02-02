// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetStudioAppTokenOpenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStudioAppTokenOpenResponseBody body;

    public static GetStudioAppTokenOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStudioAppTokenOpenResponse self = new GetStudioAppTokenOpenResponse();
        return TeaModel.build(map, self);
    }

    public GetStudioAppTokenOpenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStudioAppTokenOpenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStudioAppTokenOpenResponse setBody(GetStudioAppTokenOpenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStudioAppTokenOpenResponseBody getBody() {
        return this.body;
    }

}
