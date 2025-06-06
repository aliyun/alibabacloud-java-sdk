// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineAgentDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotlineAgentDetailResponseBody body;

    public static GetHotlineAgentDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineAgentDetailResponse self = new GetHotlineAgentDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHotlineAgentDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotlineAgentDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotlineAgentDetailResponse setBody(GetHotlineAgentDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotlineAgentDetailResponseBody getBody() {
        return this.body;
    }

}
