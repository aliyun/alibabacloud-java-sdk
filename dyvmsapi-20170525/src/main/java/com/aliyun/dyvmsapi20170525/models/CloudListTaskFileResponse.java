// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListTaskFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudListTaskFileResponseBody body;

    public static CloudListTaskFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudListTaskFileResponse self = new CloudListTaskFileResponse();
        return TeaModel.build(map, self);
    }

    public CloudListTaskFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudListTaskFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudListTaskFileResponse setBody(CloudListTaskFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudListTaskFileResponseBody getBody() {
        return this.body;
    }

}
