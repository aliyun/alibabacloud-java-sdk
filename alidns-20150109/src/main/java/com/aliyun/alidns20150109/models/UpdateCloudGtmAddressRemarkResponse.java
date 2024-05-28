// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressRemarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudGtmAddressRemarkResponseBody body;

    public static UpdateCloudGtmAddressRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressRemarkResponse self = new UpdateCloudGtmAddressRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudGtmAddressRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudGtmAddressRemarkResponse setBody(UpdateCloudGtmAddressRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudGtmAddressRemarkResponseBody getBody() {
        return this.body;
    }

}
