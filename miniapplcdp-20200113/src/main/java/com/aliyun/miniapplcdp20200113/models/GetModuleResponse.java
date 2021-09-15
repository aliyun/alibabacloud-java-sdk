// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetModuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetModuleResponseBody body;

    public static GetModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModuleResponse self = new GetModuleResponse();
        return TeaModel.build(map, self);
    }

    public GetModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModuleResponse setBody(GetModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModuleResponseBody getBody() {
        return this.body;
    }

}
