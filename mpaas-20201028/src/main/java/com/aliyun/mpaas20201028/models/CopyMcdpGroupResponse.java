// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CopyMcdpGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyMcdpGroupResponseBody body;

    public static CopyMcdpGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyMcdpGroupResponse self = new CopyMcdpGroupResponse();
        return TeaModel.build(map, self);
    }

    public CopyMcdpGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyMcdpGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyMcdpGroupResponse setBody(CopyMcdpGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyMcdpGroupResponseBody getBody() {
        return this.body;
    }

}
