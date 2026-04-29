// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListExtenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudListExtenResponseBody body;

    public static CloudListExtenResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudListExtenResponse self = new CloudListExtenResponse();
        return TeaModel.build(map, self);
    }

    public CloudListExtenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudListExtenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudListExtenResponse setBody(CloudListExtenResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudListExtenResponseBody getBody() {
        return this.body;
    }

}
