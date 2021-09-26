// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNodeCodeResponseBody body;

    public static GetNodeCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeCodeResponse self = new GetNodeCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodeCodeResponse setBody(GetNodeCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeCodeResponseBody getBody() {
        return this.body;
    }

}
