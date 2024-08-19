// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetUserBuyStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserBuyStatusResponseBody body;

    public static GetUserBuyStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserBuyStatusResponse self = new GetUserBuyStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetUserBuyStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserBuyStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserBuyStatusResponse setBody(GetUserBuyStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserBuyStatusResponseBody getBody() {
        return this.body;
    }

}
