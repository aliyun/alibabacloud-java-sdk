// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListLniPrivateIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLniPrivateIpAddressResponseBody body;

    public static ListLniPrivateIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLniPrivateIpAddressResponse self = new ListLniPrivateIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public ListLniPrivateIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLniPrivateIpAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLniPrivateIpAddressResponse setBody(ListLniPrivateIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLniPrivateIpAddressResponseBody getBody() {
        return this.body;
    }

}
