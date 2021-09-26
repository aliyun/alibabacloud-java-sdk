// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAiOutboundTaskListResponseBody body;

    public static GetAiOutboundTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskListResponse self = new GetAiOutboundTaskListResponse();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiOutboundTaskListResponse setBody(GetAiOutboundTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiOutboundTaskListResponseBody getBody() {
        return this.body;
    }

}
