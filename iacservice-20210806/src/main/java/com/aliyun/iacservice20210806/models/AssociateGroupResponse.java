// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class AssociateGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateGroupResponseBody body;

    public static AssociateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateGroupResponse self = new AssociateGroupResponse();
        return TeaModel.build(map, self);
    }

    public AssociateGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateGroupResponse setBody(AssociateGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateGroupResponseBody getBody() {
        return this.body;
    }

}
