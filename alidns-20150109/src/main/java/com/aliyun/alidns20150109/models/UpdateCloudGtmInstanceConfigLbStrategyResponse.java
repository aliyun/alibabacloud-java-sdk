// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceConfigLbStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudGtmInstanceConfigLbStrategyResponseBody body;

    public static UpdateCloudGtmInstanceConfigLbStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmInstanceConfigLbStrategyResponse self = new UpdateCloudGtmInstanceConfigLbStrategyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmInstanceConfigLbStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudGtmInstanceConfigLbStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudGtmInstanceConfigLbStrategyResponse setBody(UpdateCloudGtmInstanceConfigLbStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudGtmInstanceConfigLbStrategyResponseBody getBody() {
        return this.body;
    }

}
