// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateFlowLimitNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFlowLimitNewResponseBody body;

    public static CreateFlowLimitNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowLimitNewResponse self = new CreateFlowLimitNewResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowLimitNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowLimitNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFlowLimitNewResponse setBody(CreateFlowLimitNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowLimitNewResponseBody getBody() {
        return this.body;
    }

}
