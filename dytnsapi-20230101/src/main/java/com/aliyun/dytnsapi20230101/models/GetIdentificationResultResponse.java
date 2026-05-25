// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20230101.models;

import com.aliyun.tea.*;

public class GetIdentificationResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIdentificationResultResponseBody body;

    public static GetIdentificationResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIdentificationResultResponse self = new GetIdentificationResultResponse();
        return TeaModel.build(map, self);
    }

    public GetIdentificationResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIdentificationResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIdentificationResultResponse setBody(GetIdentificationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIdentificationResultResponseBody getBody() {
        return this.body;
    }

}
