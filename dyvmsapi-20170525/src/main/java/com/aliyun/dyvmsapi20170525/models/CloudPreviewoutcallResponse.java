// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudPreviewoutcallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudPreviewoutcallResponseBody body;

    public static CloudPreviewoutcallResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudPreviewoutcallResponse self = new CloudPreviewoutcallResponse();
        return TeaModel.build(map, self);
    }

    public CloudPreviewoutcallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudPreviewoutcallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudPreviewoutcallResponse setBody(CloudPreviewoutcallResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudPreviewoutcallResponseBody getBody() {
        return this.body;
    }

}
