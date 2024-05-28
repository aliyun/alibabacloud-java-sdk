// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressPoolLbStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudGtmAddressPoolLbStrategyResponseBody body;

    public static UpdateCloudGtmAddressPoolLbStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressPoolLbStrategyResponse self = new UpdateCloudGtmAddressPoolLbStrategyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressPoolLbStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudGtmAddressPoolLbStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudGtmAddressPoolLbStrategyResponse setBody(UpdateCloudGtmAddressPoolLbStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudGtmAddressPoolLbStrategyResponseBody getBody() {
        return this.body;
    }

}
