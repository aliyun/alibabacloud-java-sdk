// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetTaskGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTaskGroupResponseBody body;

    public static GetTaskGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskGroupResponse self = new GetTaskGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskGroupResponse setBody(GetTaskGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskGroupResponseBody getBody() {
        return this.body;
    }

}
