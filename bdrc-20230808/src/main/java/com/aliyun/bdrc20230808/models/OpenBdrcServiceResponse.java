// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class OpenBdrcServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenBdrcServiceResponseBody body;

    public static OpenBdrcServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenBdrcServiceResponse self = new OpenBdrcServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenBdrcServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenBdrcServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenBdrcServiceResponse setBody(OpenBdrcServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenBdrcServiceResponseBody getBody() {
        return this.body;
    }

}
