// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDnsGtmAddressPoolResponseBody body;

    public static UpdateDnsGtmAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmAddressPoolResponse self = new UpdateDnsGtmAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmAddressPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDnsGtmAddressPoolResponse setBody(UpdateDnsGtmAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDnsGtmAddressPoolResponseBody getBody() {
        return this.body;
    }

}
