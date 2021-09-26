// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAiOutboundTaskDetailResponseBody body;

    public static GetAiOutboundTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskDetailResponse self = new GetAiOutboundTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiOutboundTaskDetailResponse setBody(GetAiOutboundTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiOutboundTaskDetailResponseBody getBody() {
        return this.body;
    }

}
