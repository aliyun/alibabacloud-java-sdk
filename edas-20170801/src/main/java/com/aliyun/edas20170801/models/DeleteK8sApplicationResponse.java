// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteK8sApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteK8sApplicationResponseBody body;

    public static DeleteK8sApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteK8sApplicationResponse self = new DeleteK8sApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteK8sApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteK8sApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteK8sApplicationResponse setBody(DeleteK8sApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteK8sApplicationResponseBody getBody() {
        return this.body;
    }

}
