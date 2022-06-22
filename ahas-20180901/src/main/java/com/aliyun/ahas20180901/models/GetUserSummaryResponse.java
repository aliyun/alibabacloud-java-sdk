// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetUserSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserSummaryResponseBody body;

    public static GetUserSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserSummaryResponse self = new GetUserSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetUserSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserSummaryResponse setBody(GetUserSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserSummaryResponseBody getBody() {
        return this.body;
    }

}
