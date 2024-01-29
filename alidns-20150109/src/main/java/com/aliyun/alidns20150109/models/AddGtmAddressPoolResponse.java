// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddGtmAddressPoolResponseBody body;

    public static AddGtmAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGtmAddressPoolResponse self = new AddGtmAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public AddGtmAddressPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGtmAddressPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGtmAddressPoolResponse setBody(AddGtmAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGtmAddressPoolResponseBody getBody() {
        return this.body;
    }

}
