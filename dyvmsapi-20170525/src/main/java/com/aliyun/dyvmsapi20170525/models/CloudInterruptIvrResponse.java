// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudInterruptIvrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudInterruptIvrResponseBody body;

    public static CloudInterruptIvrResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudInterruptIvrResponse self = new CloudInterruptIvrResponse();
        return TeaModel.build(map, self);
    }

    public CloudInterruptIvrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudInterruptIvrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudInterruptIvrResponse setBody(CloudInterruptIvrResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudInterruptIvrResponseBody getBody() {
        return this.body;
    }

}
