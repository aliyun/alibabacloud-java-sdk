// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GetInstancePublishTaskStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstancePublishTaskStateResponseBody body;

    public static GetInstancePublishTaskStateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstancePublishTaskStateResponse self = new GetInstancePublishTaskStateResponse();
        return TeaModel.build(map, self);
    }

    public GetInstancePublishTaskStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstancePublishTaskStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstancePublishTaskStateResponse setBody(GetInstancePublishTaskStateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstancePublishTaskStateResponseBody getBody() {
        return this.body;
    }

}
