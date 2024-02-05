// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNotifyMeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNotifyMeResponseBody body;

    public static GetNotifyMeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNotifyMeResponse self = new GetNotifyMeResponse();
        return TeaModel.build(map, self);
    }

    public GetNotifyMeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNotifyMeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNotifyMeResponse setBody(GetNotifyMeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNotifyMeResponseBody getBody() {
        return this.body;
    }

}
