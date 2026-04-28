// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryWebcallCdrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudQueryWebcallCdrResponseBody body;

    public static CloudQueryWebcallCdrResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryWebcallCdrResponse self = new CloudQueryWebcallCdrResponse();
        return TeaModel.build(map, self);
    }

    public CloudQueryWebcallCdrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudQueryWebcallCdrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudQueryWebcallCdrResponse setBody(CloudQueryWebcallCdrResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudQueryWebcallCdrResponseBody getBody() {
        return this.body;
    }

}
