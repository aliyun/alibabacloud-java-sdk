// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ReConfigApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReConfigApplicationResponseBody body;

    public static ReConfigApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ReConfigApplicationResponse self = new ReConfigApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ReConfigApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReConfigApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReConfigApplicationResponse setBody(ReConfigApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ReConfigApplicationResponseBody getBody() {
        return this.body;
    }

}
