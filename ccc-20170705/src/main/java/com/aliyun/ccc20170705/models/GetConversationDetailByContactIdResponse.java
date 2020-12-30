// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetConversationDetailByContactIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetConversationDetailByContactIdResponseBody body;

    public static GetConversationDetailByContactIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConversationDetailByContactIdResponse self = new GetConversationDetailByContactIdResponse();
        return TeaModel.build(map, self);
    }

    public GetConversationDetailByContactIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConversationDetailByContactIdResponse setBody(GetConversationDetailByContactIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConversationDetailByContactIdResponseBody getBody() {
        return this.body;
    }

}
