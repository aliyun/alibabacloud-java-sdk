// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListLeniPrivateIpAddressesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLeniPrivateIpAddressesResponseBody body;

    public static ListLeniPrivateIpAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLeniPrivateIpAddressesResponse self = new ListLeniPrivateIpAddressesResponse();
        return TeaModel.build(map, self);
    }

    public ListLeniPrivateIpAddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLeniPrivateIpAddressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLeniPrivateIpAddressesResponse setBody(ListLeniPrivateIpAddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLeniPrivateIpAddressesResponseBody getBody() {
        return this.body;
    }

}
