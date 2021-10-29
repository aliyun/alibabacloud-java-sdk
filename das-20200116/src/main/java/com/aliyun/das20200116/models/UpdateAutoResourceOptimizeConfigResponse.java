// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoResourceOptimizeConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAutoResourceOptimizeConfigResponseBody body;

    public static UpdateAutoResourceOptimizeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoResourceOptimizeConfigResponse self = new UpdateAutoResourceOptimizeConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAutoResourceOptimizeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAutoResourceOptimizeConfigResponse setBody(UpdateAutoResourceOptimizeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAutoResourceOptimizeConfigResponseBody getBody() {
        return this.body;
    }

}
