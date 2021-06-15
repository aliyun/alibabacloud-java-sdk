// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RelieveAccountRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RelieveAccountRelationResponseBody body;

    public static RelieveAccountRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        RelieveAccountRelationResponse self = new RelieveAccountRelationResponse();
        return TeaModel.build(map, self);
    }

    public RelieveAccountRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RelieveAccountRelationResponse setBody(RelieveAccountRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public RelieveAccountRelationResponseBody getBody() {
        return this.body;
    }

}
