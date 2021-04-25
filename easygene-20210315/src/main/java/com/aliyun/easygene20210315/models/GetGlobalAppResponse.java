// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetGlobalAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetGlobalAppResponseBody body;

    public static GetGlobalAppResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalAppResponse self = new GetGlobalAppResponse();
        return TeaModel.build(map, self);
    }

    public GetGlobalAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGlobalAppResponse setBody(GetGlobalAppResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGlobalAppResponseBody getBody() {
        return this.body;
    }

}
