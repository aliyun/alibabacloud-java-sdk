// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetPcrInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPcrInfoResponseBody body;

    public static GetPcrInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPcrInfoResponse self = new GetPcrInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetPcrInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPcrInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPcrInfoResponse setBody(GetPcrInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPcrInfoResponseBody getBody() {
        return this.body;
    }

}
