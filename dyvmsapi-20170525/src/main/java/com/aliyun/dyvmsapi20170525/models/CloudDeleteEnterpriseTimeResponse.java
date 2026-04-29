// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteEnterpriseTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudDeleteEnterpriseTimeResponseBody body;

    public static CloudDeleteEnterpriseTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteEnterpriseTimeResponse self = new CloudDeleteEnterpriseTimeResponse();
        return TeaModel.build(map, self);
    }

    public CloudDeleteEnterpriseTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudDeleteEnterpriseTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudDeleteEnterpriseTimeResponse setBody(CloudDeleteEnterpriseTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudDeleteEnterpriseTimeResponseBody getBody() {
        return this.body;
    }

}
