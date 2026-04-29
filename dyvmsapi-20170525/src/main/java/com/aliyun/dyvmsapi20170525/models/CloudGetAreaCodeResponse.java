// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetAreaCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudGetAreaCodeResponseBody body;

    public static CloudGetAreaCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudGetAreaCodeResponse self = new CloudGetAreaCodeResponse();
        return TeaModel.build(map, self);
    }

    public CloudGetAreaCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudGetAreaCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudGetAreaCodeResponse setBody(CloudGetAreaCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudGetAreaCodeResponseBody getBody() {
        return this.body;
    }

}
