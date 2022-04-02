// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetPostScriptsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPostScriptsResponseBody body;

    public static GetPostScriptsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPostScriptsResponse self = new GetPostScriptsResponse();
        return TeaModel.build(map, self);
    }

    public GetPostScriptsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPostScriptsResponse setBody(GetPostScriptsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPostScriptsResponseBody getBody() {
        return this.body;
    }

}
