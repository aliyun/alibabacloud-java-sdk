// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateFlowLimitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFlowLimitResponseBody body;

    public static CreateFlowLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowLimitResponse self = new CreateFlowLimitResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFlowLimitResponse setBody(CreateFlowLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowLimitResponseBody getBody() {
        return this.body;
    }

}
