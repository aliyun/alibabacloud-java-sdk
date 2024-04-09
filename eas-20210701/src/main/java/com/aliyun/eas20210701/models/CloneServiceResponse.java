// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CloneServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloneServiceResponseBody body;

    public static CloneServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneServiceResponse self = new CloneServiceResponse();
        return TeaModel.build(map, self);
    }

    public CloneServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneServiceResponse setBody(CloneServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneServiceResponseBody getBody() {
        return this.body;
    }

}
