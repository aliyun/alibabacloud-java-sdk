// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetAgentDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgentDataResponseBody body;

    public static GetAgentDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentDataResponse self = new GetAgentDataResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentDataResponse setBody(GetAgentDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentDataResponseBody getBody() {
        return this.body;
    }

}
