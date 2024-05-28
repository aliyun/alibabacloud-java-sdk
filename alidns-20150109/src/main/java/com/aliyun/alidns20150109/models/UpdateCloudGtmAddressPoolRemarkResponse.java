// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressPoolRemarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudGtmAddressPoolRemarkResponseBody body;

    public static UpdateCloudGtmAddressPoolRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressPoolRemarkResponse self = new UpdateCloudGtmAddressPoolRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressPoolRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudGtmAddressPoolRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudGtmAddressPoolRemarkResponse setBody(UpdateCloudGtmAddressPoolRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudGtmAddressPoolRemarkResponseBody getBody() {
        return this.body;
    }

}
