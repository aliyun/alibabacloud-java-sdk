// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class StopK8sApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopK8sApplicationResponseBody body;

    public static StopK8sApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        StopK8sApplicationResponse self = new StopK8sApplicationResponse();
        return TeaModel.build(map, self);
    }

    public StopK8sApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopK8sApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopK8sApplicationResponse setBody(StopK8sApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public StopK8sApplicationResponseBody getBody() {
        return this.body;
    }

}
