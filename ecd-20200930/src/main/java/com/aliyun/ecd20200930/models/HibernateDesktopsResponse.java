// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class HibernateDesktopsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HibernateDesktopsResponseBody body;

    public static HibernateDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        HibernateDesktopsResponse self = new HibernateDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public HibernateDesktopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HibernateDesktopsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HibernateDesktopsResponse setBody(HibernateDesktopsResponseBody body) {
        this.body = body;
        return this;
    }
    public HibernateDesktopsResponseBody getBody() {
        return this.body;
    }

}
