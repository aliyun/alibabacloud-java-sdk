// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20230101.models;

import com.aliyun.tea.*;

public class GetIdentificationSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIdentificationSessionResponseBody body;

    public static GetIdentificationSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIdentificationSessionResponse self = new GetIdentificationSessionResponse();
        return TeaModel.build(map, self);
    }

    public GetIdentificationSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIdentificationSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIdentificationSessionResponse setBody(GetIdentificationSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIdentificationSessionResponseBody getBody() {
        return this.body;
    }

}
