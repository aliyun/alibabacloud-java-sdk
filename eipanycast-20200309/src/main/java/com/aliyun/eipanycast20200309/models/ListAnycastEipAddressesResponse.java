// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ListAnycastEipAddressesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAnycastEipAddressesResponseBody body;

    public static ListAnycastEipAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAnycastEipAddressesResponse self = new ListAnycastEipAddressesResponse();
        return TeaModel.build(map, self);
    }

    public ListAnycastEipAddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAnycastEipAddressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAnycastEipAddressesResponse setBody(ListAnycastEipAddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAnycastEipAddressesResponseBody getBody() {
        return this.body;
    }

}
