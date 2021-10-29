// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoResourceOptimizeConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAutoResourceOptimizeConfigResponseBody body;

    public static GetAutoResourceOptimizeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoResourceOptimizeConfigResponse self = new GetAutoResourceOptimizeConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoResourceOptimizeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoResourceOptimizeConfigResponse setBody(GetAutoResourceOptimizeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoResourceOptimizeConfigResponseBody getBody() {
        return this.body;
    }

}
