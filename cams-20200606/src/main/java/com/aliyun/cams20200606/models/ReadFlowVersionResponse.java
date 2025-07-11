// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ReadFlowVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadFlowVersionResponseBody body;

    public static ReadFlowVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadFlowVersionResponse self = new ReadFlowVersionResponse();
        return TeaModel.build(map, self);
    }

    public ReadFlowVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadFlowVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadFlowVersionResponse setBody(ReadFlowVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadFlowVersionResponseBody getBody() {
        return this.body;
    }

}
