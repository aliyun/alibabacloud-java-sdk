// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class RollbackStagingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackStagingConfigResponseBody body;

    public static RollbackStagingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackStagingConfigResponse self = new RollbackStagingConfigResponse();
        return TeaModel.build(map, self);
    }

    public RollbackStagingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackStagingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackStagingConfigResponse setBody(RollbackStagingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackStagingConfigResponseBody getBody() {
        return this.body;
    }

}
