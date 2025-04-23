// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CloneGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloneGroupResponseBody body;

    public static CloneGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneGroupResponse self = new CloneGroupResponse();
        return TeaModel.build(map, self);
    }

    public CloneGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneGroupResponse setBody(CloneGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneGroupResponseBody getBody() {
        return this.body;
    }

}
