// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class GetTextbookAssistantTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTextbookAssistantTokenResponseBody body;

    public static GetTextbookAssistantTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTextbookAssistantTokenResponse self = new GetTextbookAssistantTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetTextbookAssistantTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTextbookAssistantTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTextbookAssistantTokenResponse setBody(GetTextbookAssistantTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTextbookAssistantTokenResponseBody getBody() {
        return this.body;
    }

}
