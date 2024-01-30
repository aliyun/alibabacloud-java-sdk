// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sApplicationConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateK8sApplicationConfigResponseBody body;

    public static UpdateK8sApplicationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sApplicationConfigResponse self = new UpdateK8sApplicationConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateK8sApplicationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateK8sApplicationConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateK8sApplicationConfigResponse setBody(UpdateK8sApplicationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateK8sApplicationConfigResponseBody getBody() {
        return this.body;
    }

}
