// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetFullRequestSampleByInstanceIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFullRequestSampleByInstanceIdResponseBody body;

    public static GetFullRequestSampleByInstanceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFullRequestSampleByInstanceIdResponse self = new GetFullRequestSampleByInstanceIdResponse();
        return TeaModel.build(map, self);
    }

    public GetFullRequestSampleByInstanceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFullRequestSampleByInstanceIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFullRequestSampleByInstanceIdResponse setBody(GetFullRequestSampleByInstanceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFullRequestSampleByInstanceIdResponseBody getBody() {
        return this.body;
    }

}
