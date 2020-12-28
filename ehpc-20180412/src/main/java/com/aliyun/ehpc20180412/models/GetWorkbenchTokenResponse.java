// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetWorkbenchTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWorkbenchTokenResponseBody body;

    public static GetWorkbenchTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkbenchTokenResponse self = new GetWorkbenchTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkbenchTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkbenchTokenResponse setBody(GetWorkbenchTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkbenchTokenResponseBody getBody() {
        return this.body;
    }

}
