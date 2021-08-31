// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class InvokeServiceInstanceOperationAPIResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InvokeServiceInstanceOperationAPIResponseBody body;

    public static InvokeServiceInstanceOperationAPIResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeServiceInstanceOperationAPIResponse self = new InvokeServiceInstanceOperationAPIResponse();
        return TeaModel.build(map, self);
    }

    public InvokeServiceInstanceOperationAPIResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeServiceInstanceOperationAPIResponse setBody(InvokeServiceInstanceOperationAPIResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeServiceInstanceOperationAPIResponseBody getBody() {
        return this.body;
    }

}
