// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutScalingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScalingConfigStatus body;

    public static PutScalingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PutScalingConfigResponse self = new PutScalingConfigResponse();
        return TeaModel.build(map, self);
    }

    public PutScalingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutScalingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutScalingConfigResponse setBody(ScalingConfigStatus body) {
        this.body = body;
        return this;
    }
    public ScalingConfigStatus getBody() {
        return this.body;
    }

}
