// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteK8sServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteK8sServiceResponseBody body;

    public static DeleteK8sServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteK8sServiceResponse self = new DeleteK8sServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteK8sServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteK8sServiceResponse setBody(DeleteK8sServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteK8sServiceResponseBody getBody() {
        return this.body;
    }

}
