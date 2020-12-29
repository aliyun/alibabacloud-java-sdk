// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteGtmAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGtmAddressPoolResponseBody body;

    public static DeleteGtmAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGtmAddressPoolResponse self = new DeleteGtmAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGtmAddressPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGtmAddressPoolResponse setBody(DeleteGtmAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGtmAddressPoolResponseBody getBody() {
        return this.body;
    }

}
