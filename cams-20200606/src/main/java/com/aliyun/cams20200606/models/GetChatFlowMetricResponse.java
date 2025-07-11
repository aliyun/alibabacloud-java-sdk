// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatFlowMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChatFlowMetricResponseBody body;

    public static GetChatFlowMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChatFlowMetricResponse self = new GetChatFlowMetricResponse();
        return TeaModel.build(map, self);
    }

    public GetChatFlowMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChatFlowMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChatFlowMetricResponse setBody(GetChatFlowMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatFlowMetricResponseBody getBody() {
        return this.body;
    }

}
