// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressPoolBasicConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudGtmAddressPoolBasicConfigResponseBody body;

    public static UpdateCloudGtmAddressPoolBasicConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressPoolBasicConfigResponse self = new UpdateCloudGtmAddressPoolBasicConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressPoolBasicConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudGtmAddressPoolBasicConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudGtmAddressPoolBasicConfigResponse setBody(UpdateCloudGtmAddressPoolBasicConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudGtmAddressPoolBasicConfigResponseBody getBody() {
        return this.body;
    }

}
