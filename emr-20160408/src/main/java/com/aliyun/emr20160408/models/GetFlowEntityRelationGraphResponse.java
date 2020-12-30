// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetFlowEntityRelationGraphResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFlowEntityRelationGraphResponseBody body;

    public static GetFlowEntityRelationGraphResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFlowEntityRelationGraphResponse self = new GetFlowEntityRelationGraphResponse();
        return TeaModel.build(map, self);
    }

    public GetFlowEntityRelationGraphResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFlowEntityRelationGraphResponse setBody(GetFlowEntityRelationGraphResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFlowEntityRelationGraphResponseBody getBody() {
        return this.body;
    }

}
