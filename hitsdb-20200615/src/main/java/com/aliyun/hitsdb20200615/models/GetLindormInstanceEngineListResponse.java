// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormInstanceEngineListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLindormInstanceEngineListResponseBody body;

    public static GetLindormInstanceEngineListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLindormInstanceEngineListResponse self = new GetLindormInstanceEngineListResponse();
        return TeaModel.build(map, self);
    }

    public GetLindormInstanceEngineListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLindormInstanceEngineListResponse setBody(GetLindormInstanceEngineListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLindormInstanceEngineListResponseBody getBody() {
        return this.body;
    }

}
