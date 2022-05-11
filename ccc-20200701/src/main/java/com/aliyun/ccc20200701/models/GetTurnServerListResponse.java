// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetTurnServerListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTurnServerListResponseBody body;

    public static GetTurnServerListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTurnServerListResponse self = new GetTurnServerListResponse();
        return TeaModel.build(map, self);
    }

    public GetTurnServerListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTurnServerListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTurnServerListResponse setBody(GetTurnServerListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTurnServerListResponseBody getBody() {
        return this.body;
    }

}
