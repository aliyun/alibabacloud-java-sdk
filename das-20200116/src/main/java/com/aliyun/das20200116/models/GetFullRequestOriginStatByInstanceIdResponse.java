// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetFullRequestOriginStatByInstanceIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFullRequestOriginStatByInstanceIdResponseBody body;

    public static GetFullRequestOriginStatByInstanceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFullRequestOriginStatByInstanceIdResponse self = new GetFullRequestOriginStatByInstanceIdResponse();
        return TeaModel.build(map, self);
    }

    public GetFullRequestOriginStatByInstanceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFullRequestOriginStatByInstanceIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFullRequestOriginStatByInstanceIdResponse setBody(GetFullRequestOriginStatByInstanceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFullRequestOriginStatByInstanceIdResponseBody getBody() {
        return this.body;
    }

}
