// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTaskInstanceRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskInstanceRelationResponseBody body;

    public static GetTaskInstanceRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskInstanceRelationResponse self = new GetTaskInstanceRelationResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskInstanceRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskInstanceRelationResponse setBody(GetTaskInstanceRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskInstanceRelationResponseBody getBody() {
        return this.body;
    }

}
