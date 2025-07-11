// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class OnlineFlowVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OnlineFlowVersionResponseBody body;

    public static OnlineFlowVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        OnlineFlowVersionResponse self = new OnlineFlowVersionResponse();
        return TeaModel.build(map, self);
    }

    public OnlineFlowVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnlineFlowVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnlineFlowVersionResponse setBody(OnlineFlowVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public OnlineFlowVersionResponseBody getBody() {
        return this.body;
    }

}
