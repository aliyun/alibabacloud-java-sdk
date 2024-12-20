// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetAiOutboundTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiOutboundTaskDetailResponse setBody(GetAiOutboundTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiOutboundTaskDetailResponseBody getBody() {
        return this.body;
    }

}
