// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GetScalingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScalingConfigStatus body;

    public static GetScalingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScalingConfigResponse self = new GetScalingConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetScalingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScalingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScalingConfigResponse setBody(ScalingConfigStatus body) {
        this.body = body;
        return this;
    }
    public ScalingConfigStatus getBody() {
        return this.body;
    }

}
