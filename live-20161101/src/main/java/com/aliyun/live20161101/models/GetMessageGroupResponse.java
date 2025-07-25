// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMessageGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMessageGroupResponseBody body;

    public static GetMessageGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageGroupResponse self = new GetMessageGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetMessageGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessageGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMessageGroupResponse setBody(GetMessageGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessageGroupResponseBody getBody() {
        return this.body;
    }

}
