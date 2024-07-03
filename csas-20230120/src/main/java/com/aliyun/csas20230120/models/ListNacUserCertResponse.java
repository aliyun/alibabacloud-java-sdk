// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListNacUserCertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNacUserCertResponseBody body;

    public static ListNacUserCertResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNacUserCertResponse self = new ListNacUserCertResponse();
        return TeaModel.build(map, self);
    }

    public ListNacUserCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNacUserCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNacUserCertResponse setBody(ListNacUserCertResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNacUserCertResponseBody getBody() {
        return this.body;
    }

}
