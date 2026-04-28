// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryObCdrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudQueryObCdrResponseBody body;

    public static CloudQueryObCdrResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryObCdrResponse self = new CloudQueryObCdrResponse();
        return TeaModel.build(map, self);
    }

    public CloudQueryObCdrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudQueryObCdrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudQueryObCdrResponse setBody(CloudQueryObCdrResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudQueryObCdrResponseBody getBody() {
        return this.body;
    }

}
