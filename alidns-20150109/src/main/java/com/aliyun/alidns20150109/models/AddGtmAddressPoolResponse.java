// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddGtmAddressPoolResponse setBody(AddGtmAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGtmAddressPoolResponseBody getBody() {
        return this.body;
    }

}
