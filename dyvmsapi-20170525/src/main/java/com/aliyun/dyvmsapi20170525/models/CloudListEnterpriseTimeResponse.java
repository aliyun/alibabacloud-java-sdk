// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListEnterpriseTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudListEnterpriseTimeResponseBody body;

    public static CloudListEnterpriseTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudListEnterpriseTimeResponse self = new CloudListEnterpriseTimeResponse();
        return TeaModel.build(map, self);
    }

    public CloudListEnterpriseTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudListEnterpriseTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudListEnterpriseTimeResponse setBody(CloudListEnterpriseTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudListEnterpriseTimeResponseBody getBody() {
        return this.body;
    }

}
