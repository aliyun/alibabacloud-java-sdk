// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetFullRequestStatResultByInstanceIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFullRequestStatResultByInstanceIdResponseBody body;

    public static GetFullRequestStatResultByInstanceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFullRequestStatResultByInstanceIdResponse self = new GetFullRequestStatResultByInstanceIdResponse();
        return TeaModel.build(map, self);
    }

    public GetFullRequestStatResultByInstanceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFullRequestStatResultByInstanceIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFullRequestStatResultByInstanceIdResponse setBody(GetFullRequestStatResultByInstanceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFullRequestStatResultByInstanceIdResponseBody getBody() {
        return this.body;
    }

}
