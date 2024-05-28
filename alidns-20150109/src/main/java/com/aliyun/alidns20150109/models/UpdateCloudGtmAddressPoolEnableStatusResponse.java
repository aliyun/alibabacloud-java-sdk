// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressPoolEnableStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudGtmAddressPoolEnableStatusResponseBody body;

    public static UpdateCloudGtmAddressPoolEnableStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressPoolEnableStatusResponse self = new UpdateCloudGtmAddressPoolEnableStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressPoolEnableStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudGtmAddressPoolEnableStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudGtmAddressPoolEnableStatusResponse setBody(UpdateCloudGtmAddressPoolEnableStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudGtmAddressPoolEnableStatusResponseBody getBody() {
        return this.body;
    }

}
