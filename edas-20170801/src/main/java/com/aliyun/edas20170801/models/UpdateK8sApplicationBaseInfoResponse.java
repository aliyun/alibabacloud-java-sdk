// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sApplicationBaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateK8sApplicationBaseInfoResponseBody body;

    public static UpdateK8sApplicationBaseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sApplicationBaseInfoResponse self = new UpdateK8sApplicationBaseInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateK8sApplicationBaseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateK8sApplicationBaseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateK8sApplicationBaseInfoResponse setBody(UpdateK8sApplicationBaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateK8sApplicationBaseInfoResponseBody getBody() {
        return this.body;
    }

}
