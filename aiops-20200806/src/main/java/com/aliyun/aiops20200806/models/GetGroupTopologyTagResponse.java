// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetGroupTopologyTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGroupTopologyTagResponseBody body;

    public static GetGroupTopologyTagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGroupTopologyTagResponse self = new GetGroupTopologyTagResponse();
        return TeaModel.build(map, self);
    }

    public GetGroupTopologyTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGroupTopologyTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGroupTopologyTagResponse setBody(GetGroupTopologyTagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGroupTopologyTagResponseBody getBody() {
        return this.body;
    }

}
