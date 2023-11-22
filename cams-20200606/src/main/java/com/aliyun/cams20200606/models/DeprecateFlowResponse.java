// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeprecateFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeprecateFlowResponseBody body;

    public static DeprecateFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeprecateFlowResponse self = new DeprecateFlowResponse();
        return TeaModel.build(map, self);
    }

    public DeprecateFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeprecateFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeprecateFlowResponse setBody(DeprecateFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeprecateFlowResponseBody getBody() {
        return this.body;
    }

}
