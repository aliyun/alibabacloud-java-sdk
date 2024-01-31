// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddressGetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddressGetResponseBody body;

    public static AddressGetResponse build(java.util.Map<String, ?> map) throws Exception {
        AddressGetResponse self = new AddressGetResponse();
        return TeaModel.build(map, self);
    }

    public AddressGetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddressGetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddressGetResponse setBody(AddressGetResponseBody body) {
        this.body = body;
        return this;
    }
    public AddressGetResponseBody getBody() {
        return this.body;
    }

}
