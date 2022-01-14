// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMcubeNebulaTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMcubeNebulaTaskDetailResponseBody body;

    public static GetMcubeNebulaTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMcubeNebulaTaskDetailResponse self = new GetMcubeNebulaTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetMcubeNebulaTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMcubeNebulaTaskDetailResponse setBody(GetMcubeNebulaTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMcubeNebulaTaskDetailResponseBody getBody() {
        return this.body;
    }

}
