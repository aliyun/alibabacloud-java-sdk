// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RollbackDcdnStagingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackDcdnStagingConfigResponseBody body;

    public static RollbackDcdnStagingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackDcdnStagingConfigResponse self = new RollbackDcdnStagingConfigResponse();
        return TeaModel.build(map, self);
    }

    public RollbackDcdnStagingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackDcdnStagingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackDcdnStagingConfigResponse setBody(RollbackDcdnStagingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackDcdnStagingConfigResponseBody getBody() {
        return this.body;
    }

}
