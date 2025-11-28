// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class GetBroadcastTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBroadcastTemplateResponseBody body;

    public static GetBroadcastTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBroadcastTemplateResponse self = new GetBroadcastTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetBroadcastTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBroadcastTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBroadcastTemplateResponse setBody(GetBroadcastTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBroadcastTemplateResponseBody getBody() {
        return this.body;
    }

}
