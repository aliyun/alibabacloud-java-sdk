// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsTimerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMmsTimerResponseBody body;

    public static GetMmsTimerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMmsTimerResponse self = new GetMmsTimerResponse();
        return TeaModel.build(map, self);
    }

    public GetMmsTimerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMmsTimerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMmsTimerResponse setBody(GetMmsTimerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMmsTimerResponseBody getBody() {
        return this.body;
    }

}
