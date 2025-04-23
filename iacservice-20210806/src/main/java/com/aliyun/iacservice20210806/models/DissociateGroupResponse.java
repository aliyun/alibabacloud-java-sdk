// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DissociateGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DissociateGroupResponseBody body;

    public static DissociateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateGroupResponse self = new DissociateGroupResponse();
        return TeaModel.build(map, self);
    }

    public DissociateGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DissociateGroupResponse setBody(DissociateGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateGroupResponseBody getBody() {
        return this.body;
    }

}
