// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetAutoScalingConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAutoScalingConfigurationResponseBody body;

    public static GetAutoScalingConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingConfigurationResponse self = new GetAutoScalingConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoScalingConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutoScalingConfigurationResponse setBody(GetAutoScalingConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoScalingConfigurationResponseBody getBody() {
        return this.body;
    }

}
