// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sApplicationBaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateK8sApplicationBaseInfoResponse setBody(UpdateK8sApplicationBaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateK8sApplicationBaseInfoResponseBody getBody() {
        return this.body;
    }

}
