// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicAccelerateIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBasicAccelerateIpsResponseBody body;

    public static ListBasicAccelerateIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBasicAccelerateIpsResponse self = new ListBasicAccelerateIpsResponse();
        return TeaModel.build(map, self);
    }

    public ListBasicAccelerateIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBasicAccelerateIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBasicAccelerateIpsResponse setBody(ListBasicAccelerateIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBasicAccelerateIpsResponseBody getBody() {
        return this.body;
    }

}
