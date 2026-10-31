// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetRectifyFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRectifyFlowResponseBody body;

    public static GetRectifyFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRectifyFlowResponse self = new GetRectifyFlowResponse();
        return TeaModel.build(map, self);
    }

    public GetRectifyFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRectifyFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRectifyFlowResponse setBody(GetRectifyFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRectifyFlowResponseBody getBody() {
        return this.body;
    }

}
