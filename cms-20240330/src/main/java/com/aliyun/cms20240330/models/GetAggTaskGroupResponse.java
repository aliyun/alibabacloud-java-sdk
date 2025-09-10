// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetAggTaskGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAggTaskGroupResponseBody body;

    public static GetAggTaskGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggTaskGroupResponse self = new GetAggTaskGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetAggTaskGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggTaskGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggTaskGroupResponse setBody(GetAggTaskGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggTaskGroupResponseBody getBody() {
        return this.body;
    }

}
