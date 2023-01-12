// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetIpsetsBandwidthLimitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetIpsetsBandwidthLimitResponseBody body;

    public static GetIpsetsBandwidthLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIpsetsBandwidthLimitResponse self = new GetIpsetsBandwidthLimitResponse();
        return TeaModel.build(map, self);
    }

    public GetIpsetsBandwidthLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIpsetsBandwidthLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIpsetsBandwidthLimitResponse setBody(GetIpsetsBandwidthLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIpsetsBandwidthLimitResponseBody getBody() {
        return this.body;
    }

}
