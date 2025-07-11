// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatFlowTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChatFlowTemplateResponseBody body;

    public static GetChatFlowTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChatFlowTemplateResponse self = new GetChatFlowTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetChatFlowTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChatFlowTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChatFlowTemplateResponse setBody(GetChatFlowTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatFlowTemplateResponseBody getBody() {
        return this.body;
    }

}
