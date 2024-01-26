// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetOfficeSiteSsoStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOfficeSiteSsoStatusResponseBody body;

    public static GetOfficeSiteSsoStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOfficeSiteSsoStatusResponse self = new GetOfficeSiteSsoStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetOfficeSiteSsoStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOfficeSiteSsoStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOfficeSiteSsoStatusResponse setBody(GetOfficeSiteSsoStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOfficeSiteSsoStatusResponseBody getBody() {
        return this.body;
    }

}
