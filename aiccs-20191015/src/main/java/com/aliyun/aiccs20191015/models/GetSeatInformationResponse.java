// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSeatInformationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSeatInformationResponseBody body;

    public static GetSeatInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSeatInformationResponse self = new GetSeatInformationResponse();
        return TeaModel.build(map, self);
    }

    public GetSeatInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSeatInformationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSeatInformationResponse setBody(GetSeatInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSeatInformationResponseBody getBody() {
        return this.body;
    }

}
