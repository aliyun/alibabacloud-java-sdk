// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudGtmAddressResponseBody body;

    public static CreateCloudGtmAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudGtmAddressResponse self = new CreateCloudGtmAddressResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudGtmAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudGtmAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudGtmAddressResponse setBody(CreateCloudGtmAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudGtmAddressResponseBody getBody() {
        return this.body;
    }

}
