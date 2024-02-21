// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifyAutoScalingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAutoScalingConfigResponseBody body;

    public static ModifyAutoScalingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoScalingConfigResponse self = new ModifyAutoScalingConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAutoScalingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAutoScalingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAutoScalingConfigResponse setBody(ModifyAutoScalingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAutoScalingConfigResponseBody getBody() {
        return this.body;
    }

}
