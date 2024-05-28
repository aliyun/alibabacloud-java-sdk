// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressEnableStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudGtmAddressEnableStatusResponseBody body;

    public static UpdateCloudGtmAddressEnableStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressEnableStatusResponse self = new UpdateCloudGtmAddressEnableStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressEnableStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudGtmAddressEnableStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudGtmAddressEnableStatusResponse setBody(UpdateCloudGtmAddressEnableStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudGtmAddressEnableStatusResponseBody getBody() {
        return this.body;
    }

}
