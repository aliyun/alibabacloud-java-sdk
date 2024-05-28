// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteCloudGtmAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCloudGtmAddressResponseBody body;

    public static DeleteCloudGtmAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudGtmAddressResponse self = new DeleteCloudGtmAddressResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudGtmAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudGtmAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCloudGtmAddressResponse setBody(DeleteCloudGtmAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudGtmAddressResponseBody getBody() {
        return this.body;
    }

}
