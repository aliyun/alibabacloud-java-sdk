// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RollbackLiveStagingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackLiveStagingConfigResponseBody body;

    public static RollbackLiveStagingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackLiveStagingConfigResponse self = new RollbackLiveStagingConfigResponse();
        return TeaModel.build(map, self);
    }

    public RollbackLiveStagingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackLiveStagingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackLiveStagingConfigResponse setBody(RollbackLiveStagingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackLiveStagingConfigResponseBody getBody() {
        return this.body;
    }

}
