// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetTwoCorpsRelationshipResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTwoCorpsRelationshipResponseBody body;

    public static GetTwoCorpsRelationshipResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTwoCorpsRelationshipResponse self = new GetTwoCorpsRelationshipResponse();
        return TeaModel.build(map, self);
    }

    public GetTwoCorpsRelationshipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTwoCorpsRelationshipResponse setBody(GetTwoCorpsRelationshipResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTwoCorpsRelationshipResponseBody getBody() {
        return this.body;
    }

}
