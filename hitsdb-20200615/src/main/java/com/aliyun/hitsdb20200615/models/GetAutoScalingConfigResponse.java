// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetAutoScalingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAutoScalingConfigResponseBody body;

    public static GetAutoScalingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingConfigResponse self = new GetAutoScalingConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoScalingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutoScalingConfigResponse setBody(GetAutoScalingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoScalingConfigResponseBody getBody() {
        return this.body;
    }

}
