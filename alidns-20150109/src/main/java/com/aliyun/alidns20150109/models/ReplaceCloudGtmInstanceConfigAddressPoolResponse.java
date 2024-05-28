// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ReplaceCloudGtmInstanceConfigAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReplaceCloudGtmInstanceConfigAddressPoolResponseBody body;

    public static ReplaceCloudGtmInstanceConfigAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceCloudGtmInstanceConfigAddressPoolResponse self = new ReplaceCloudGtmInstanceConfigAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceCloudGtmInstanceConfigAddressPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceCloudGtmInstanceConfigAddressPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceCloudGtmInstanceConfigAddressPoolResponse setBody(ReplaceCloudGtmInstanceConfigAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceCloudGtmInstanceConfigAddressPoolResponseBody getBody() {
        return this.body;
    }

}
