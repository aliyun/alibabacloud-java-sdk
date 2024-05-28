// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressManualAvailableStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudGtmAddressManualAvailableStatusResponseBody body;

    public static UpdateCloudGtmAddressManualAvailableStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressManualAvailableStatusResponse self = new UpdateCloudGtmAddressManualAvailableStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressManualAvailableStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudGtmAddressManualAvailableStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudGtmAddressManualAvailableStatusResponse setBody(UpdateCloudGtmAddressManualAvailableStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudGtmAddressManualAvailableStatusResponseBody getBody() {
        return this.body;
    }

}
