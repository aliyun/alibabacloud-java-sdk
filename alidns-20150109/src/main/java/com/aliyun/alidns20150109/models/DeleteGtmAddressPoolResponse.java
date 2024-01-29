// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteGtmAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteGtmAddressPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGtmAddressPoolResponse setBody(DeleteGtmAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGtmAddressPoolResponseBody getBody() {
        return this.body;
    }

}
