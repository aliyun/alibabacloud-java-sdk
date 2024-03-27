// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTaskInstanceRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetTaskInstanceRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskInstanceRelationResponse setBody(GetTaskInstanceRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskInstanceRelationResponseBody getBody() {
        return this.body;
    }

}
