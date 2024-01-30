// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class EvaluateResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EvaluateResourceResponseBody body;

    public static EvaluateResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        EvaluateResourceResponse self = new EvaluateResourceResponse();
        return TeaModel.build(map, self);
    }

    public EvaluateResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EvaluateResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EvaluateResourceResponse setBody(EvaluateResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public EvaluateResourceResponseBody getBody() {
        return this.body;
    }

}
