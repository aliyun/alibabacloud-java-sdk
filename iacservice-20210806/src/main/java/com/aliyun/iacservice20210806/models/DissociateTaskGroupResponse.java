// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DissociateTaskGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DissociateTaskGroupResponseBody body;

    public static DissociateTaskGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateTaskGroupResponse self = new DissociateTaskGroupResponse();
        return TeaModel.build(map, self);
    }

    public DissociateTaskGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateTaskGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DissociateTaskGroupResponse setBody(DissociateTaskGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateTaskGroupResponseBody getBody() {
        return this.body;
    }

}
