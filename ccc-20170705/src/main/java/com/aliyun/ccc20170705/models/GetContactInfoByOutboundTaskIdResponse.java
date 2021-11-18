// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetContactInfoByOutboundTaskIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetContactInfoByOutboundTaskIdResponseBody body;

    public static GetContactInfoByOutboundTaskIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContactInfoByOutboundTaskIdResponse self = new GetContactInfoByOutboundTaskIdResponse();
        return TeaModel.build(map, self);
    }

    public GetContactInfoByOutboundTaskIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContactInfoByOutboundTaskIdResponse setBody(GetContactInfoByOutboundTaskIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContactInfoByOutboundTaskIdResponseBody getBody() {
        return this.body;
    }

}
