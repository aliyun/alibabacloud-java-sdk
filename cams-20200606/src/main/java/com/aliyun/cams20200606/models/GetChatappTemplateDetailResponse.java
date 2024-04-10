// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappTemplateDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChatappTemplateDetailResponseBody body;

    public static GetChatappTemplateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChatappTemplateDetailResponse self = new GetChatappTemplateDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetChatappTemplateDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChatappTemplateDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChatappTemplateDetailResponse setBody(GetChatappTemplateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatappTemplateDetailResponseBody getBody() {
        return this.body;
    }

}
