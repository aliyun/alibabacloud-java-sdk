// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGtmAddressPoolResponseBody body;

    public static UpdateGtmAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmAddressPoolResponse self = new UpdateGtmAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGtmAddressPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGtmAddressPoolResponse setBody(UpdateGtmAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGtmAddressPoolResponseBody getBody() {
        return this.body;
    }

}
