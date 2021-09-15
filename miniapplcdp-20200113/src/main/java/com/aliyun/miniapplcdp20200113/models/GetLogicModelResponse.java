// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetLogicModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLogicModelResponseBody body;

    public static GetLogicModelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogicModelResponse self = new GetLogicModelResponse();
        return TeaModel.build(map, self);
    }

    public GetLogicModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogicModelResponse setBody(GetLogicModelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogicModelResponseBody getBody() {
        return this.body;
    }

}
