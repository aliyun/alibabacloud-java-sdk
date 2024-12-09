// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetUserInformationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserInformationResponseBody body;

    public static GetUserInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserInformationResponse self = new GetUserInformationResponse();
        return TeaModel.build(map, self);
    }

    public GetUserInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserInformationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserInformationResponse setBody(GetUserInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserInformationResponseBody getBody() {
        return this.body;
    }

}
