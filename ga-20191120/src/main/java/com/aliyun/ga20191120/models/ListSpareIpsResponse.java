// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListSpareIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSpareIpsResponseBody body;

    public static ListSpareIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSpareIpsResponse self = new ListSpareIpsResponse();
        return TeaModel.build(map, self);
    }

    public ListSpareIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSpareIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSpareIpsResponse setBody(ListSpareIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSpareIpsResponseBody getBody() {
        return this.body;
    }

}
