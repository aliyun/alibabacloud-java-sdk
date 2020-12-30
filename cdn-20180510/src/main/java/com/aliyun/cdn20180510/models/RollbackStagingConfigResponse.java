// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class RollbackStagingConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RollbackStagingConfigResponse setBody(RollbackStagingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackStagingConfigResponseBody getBody() {
        return this.body;
    }

}
