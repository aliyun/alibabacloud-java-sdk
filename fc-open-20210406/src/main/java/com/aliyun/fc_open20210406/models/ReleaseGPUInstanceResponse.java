// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ReleaseGPUInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    public static ReleaseGPUInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseGPUInstanceResponse self = new ReleaseGPUInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseGPUInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseGPUInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
