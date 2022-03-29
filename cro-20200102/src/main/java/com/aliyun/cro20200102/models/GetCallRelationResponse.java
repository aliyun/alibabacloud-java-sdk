// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class GetCallRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCallRelationResponseBody body;

    public static GetCallRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCallRelationResponse self = new GetCallRelationResponse();
        return TeaModel.build(map, self);
    }

    public GetCallRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCallRelationResponse setBody(GetCallRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCallRelationResponseBody getBody() {
        return this.body;
    }

}
