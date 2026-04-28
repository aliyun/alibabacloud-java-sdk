// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetObCdrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudGetObCdrResponseBody body;

    public static CloudGetObCdrResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudGetObCdrResponse self = new CloudGetObCdrResponse();
        return TeaModel.build(map, self);
    }

    public CloudGetObCdrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudGetObCdrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudGetObCdrResponse setBody(CloudGetObCdrResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudGetObCdrResponseBody getBody() {
        return this.body;
    }

}
