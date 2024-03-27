// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTaskFlowGraphResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTaskFlowGraphResponseBody body;

    public static GetTaskFlowGraphResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskFlowGraphResponse self = new GetTaskFlowGraphResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskFlowGraphResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskFlowGraphResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskFlowGraphResponse setBody(GetTaskFlowGraphResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskFlowGraphResponseBody getBody() {
        return this.body;
    }

}
