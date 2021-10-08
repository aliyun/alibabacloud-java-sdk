// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRealDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRealDataResponseBody body;

    public static GetRealDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRealDataResponse self = new GetRealDataResponse();
        return TeaModel.build(map, self);
    }

    public GetRealDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRealDataResponse setBody(GetRealDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRealDataResponseBody getBody() {
        return this.body;
    }

}
