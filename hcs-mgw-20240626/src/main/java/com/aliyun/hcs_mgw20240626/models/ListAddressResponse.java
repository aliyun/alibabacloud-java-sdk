// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAddressResponseBody body;

    public static ListAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAddressResponse self = new ListAddressResponse();
        return TeaModel.build(map, self);
    }

    public ListAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAddressResponse setBody(ListAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAddressResponseBody getBody() {
        return this.body;
    }

}
