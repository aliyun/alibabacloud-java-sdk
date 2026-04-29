// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetExtenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudGetExtenResponseBody body;

    public static CloudGetExtenResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudGetExtenResponse self = new CloudGetExtenResponse();
        return TeaModel.build(map, self);
    }

    public CloudGetExtenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudGetExtenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudGetExtenResponse setBody(CloudGetExtenResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudGetExtenResponseBody getBody() {
        return this.body;
    }

}
