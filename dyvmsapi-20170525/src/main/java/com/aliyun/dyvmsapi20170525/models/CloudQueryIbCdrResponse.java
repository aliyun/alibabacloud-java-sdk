// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryIbCdrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudQueryIbCdrResponseBody body;

    public static CloudQueryIbCdrResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryIbCdrResponse self = new CloudQueryIbCdrResponse();
        return TeaModel.build(map, self);
    }

    public CloudQueryIbCdrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudQueryIbCdrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudQueryIbCdrResponse setBody(CloudQueryIbCdrResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudQueryIbCdrResponseBody getBody() {
        return this.body;
    }

}
