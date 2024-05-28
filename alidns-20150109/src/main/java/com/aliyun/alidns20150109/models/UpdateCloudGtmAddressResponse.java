// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudGtmAddressResponseBody body;

    public static UpdateCloudGtmAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressResponse self = new UpdateCloudGtmAddressResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudGtmAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudGtmAddressResponse setBody(UpdateCloudGtmAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudGtmAddressResponseBody getBody() {
        return this.body;
    }

}
