// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateEnterpriseTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudCreateEnterpriseTimeResponseBody body;

    public static CloudCreateEnterpriseTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateEnterpriseTimeResponse self = new CloudCreateEnterpriseTimeResponse();
        return TeaModel.build(map, self);
    }

    public CloudCreateEnterpriseTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudCreateEnterpriseTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudCreateEnterpriseTimeResponse setBody(CloudCreateEnterpriseTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudCreateEnterpriseTimeResponseBody getBody() {
        return this.body;
    }

}
