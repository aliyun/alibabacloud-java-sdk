// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AbolishApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AbolishApiResponseBody body;

    public static AbolishApiResponse build(java.util.Map<String, ?> map) throws Exception {
        AbolishApiResponse self = new AbolishApiResponse();
        return TeaModel.build(map, self);
    }

    public AbolishApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbolishApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AbolishApiResponse setBody(AbolishApiResponseBody body) {
        this.body = body;
        return this;
    }
    public AbolishApiResponseBody getBody() {
        return this.body;
    }

}
