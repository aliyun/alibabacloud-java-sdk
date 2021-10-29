// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetEndpointSwitchTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEndpointSwitchTaskResponseBody body;

    public static GetEndpointSwitchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEndpointSwitchTaskResponse self = new GetEndpointSwitchTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetEndpointSwitchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEndpointSwitchTaskResponse setBody(GetEndpointSwitchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEndpointSwitchTaskResponseBody getBody() {
        return this.body;
    }

}
