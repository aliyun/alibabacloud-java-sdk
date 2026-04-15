// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetAuthTokenToMsenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuthTokenToMsenceResponseBody body;

    public static GetAuthTokenToMsenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthTokenToMsenceResponse self = new GetAuthTokenToMsenceResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthTokenToMsenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthTokenToMsenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuthTokenToMsenceResponse setBody(GetAuthTokenToMsenceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthTokenToMsenceResponseBody getBody() {
        return this.body;
    }

}
