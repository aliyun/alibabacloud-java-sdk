// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetConversationDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConversationDetailResponseBody body;

    public static GetConversationDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConversationDetailResponse self = new GetConversationDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetConversationDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConversationDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConversationDetailResponse setBody(GetConversationDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConversationDetailResponseBody getBody() {
        return this.body;
    }

}
