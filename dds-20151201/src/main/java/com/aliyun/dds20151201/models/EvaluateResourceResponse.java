// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class EvaluateResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public EvaluateResourceResponse setBody(EvaluateResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public EvaluateResourceResponseBody getBody() {
        return this.body;
    }

}
