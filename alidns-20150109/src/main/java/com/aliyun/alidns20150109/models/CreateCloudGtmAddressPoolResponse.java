// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudGtmAddressPoolResponseBody body;

    public static CreateCloudGtmAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudGtmAddressPoolResponse self = new CreateCloudGtmAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudGtmAddressPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudGtmAddressPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudGtmAddressPoolResponse setBody(CreateCloudGtmAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudGtmAddressPoolResponseBody getBody() {
        return this.body;
    }

}
