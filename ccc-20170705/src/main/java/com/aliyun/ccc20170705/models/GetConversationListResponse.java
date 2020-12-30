// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetConversationListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetConversationListResponseBody body;

    public static GetConversationListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConversationListResponse self = new GetConversationListResponse();
        return TeaModel.build(map, self);
    }

    public GetConversationListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConversationListResponse setBody(GetConversationListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConversationListResponseBody getBody() {
        return this.body;
    }

}
