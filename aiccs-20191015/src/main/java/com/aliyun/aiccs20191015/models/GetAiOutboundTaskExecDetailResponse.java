// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskExecDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAiOutboundTaskExecDetailResponseBody body;

    public static GetAiOutboundTaskExecDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskExecDetailResponse self = new GetAiOutboundTaskExecDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskExecDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiOutboundTaskExecDetailResponse setBody(GetAiOutboundTaskExecDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiOutboundTaskExecDetailResponseBody getBody() {
        return this.body;
    }

}
