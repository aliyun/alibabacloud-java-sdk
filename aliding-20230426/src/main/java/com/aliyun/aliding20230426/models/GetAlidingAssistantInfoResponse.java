// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetAlidingAssistantInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlidingAssistantInfoResponseBody body;

    public static GetAlidingAssistantInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlidingAssistantInfoResponse self = new GetAlidingAssistantInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAlidingAssistantInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlidingAssistantInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlidingAssistantInfoResponse setBody(GetAlidingAssistantInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlidingAssistantInfoResponseBody getBody() {
        return this.body;
    }

}
