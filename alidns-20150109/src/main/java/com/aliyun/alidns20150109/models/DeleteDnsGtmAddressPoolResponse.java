// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDnsGtmAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDnsGtmAddressPoolResponseBody body;

    public static DeleteDnsGtmAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnsGtmAddressPoolResponse self = new DeleteDnsGtmAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDnsGtmAddressPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDnsGtmAddressPoolResponse setBody(DeleteDnsGtmAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDnsGtmAddressPoolResponseBody getBody() {
        return this.body;
    }

}
