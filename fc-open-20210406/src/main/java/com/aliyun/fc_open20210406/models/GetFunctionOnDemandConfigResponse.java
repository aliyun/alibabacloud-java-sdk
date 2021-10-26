// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetFunctionOnDemandConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFunctionOnDemandConfigResponseBody body;

    public static GetFunctionOnDemandConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionOnDemandConfigResponse self = new GetFunctionOnDemandConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetFunctionOnDemandConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFunctionOnDemandConfigResponse setBody(GetFunctionOnDemandConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFunctionOnDemandConfigResponseBody getBody() {
        return this.body;
    }

}
