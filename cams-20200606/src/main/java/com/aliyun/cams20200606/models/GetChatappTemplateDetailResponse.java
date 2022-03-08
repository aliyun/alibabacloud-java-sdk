// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappTemplateDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetChatappTemplateDetailResponse setBody(GetChatappTemplateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatappTemplateDetailResponseBody getBody() {
        return this.body;
    }

}
