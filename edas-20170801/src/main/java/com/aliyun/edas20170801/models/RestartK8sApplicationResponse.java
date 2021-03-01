// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RestartK8sApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestartK8sApplicationResponseBody body;

    public static RestartK8sApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartK8sApplicationResponse self = new RestartK8sApplicationResponse();
        return TeaModel.build(map, self);
    }

    public RestartK8sApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartK8sApplicationResponse setBody(RestartK8sApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartK8sApplicationResponseBody getBody() {
        return this.body;
    }

}
