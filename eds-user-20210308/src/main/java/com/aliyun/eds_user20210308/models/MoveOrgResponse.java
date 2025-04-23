// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class MoveOrgResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveOrgResponseBody body;

    public static MoveOrgResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveOrgResponse self = new MoveOrgResponse();
        return TeaModel.build(map, self);
    }

    public MoveOrgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveOrgResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveOrgResponse setBody(MoveOrgResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveOrgResponseBody getBody() {
        return this.body;
    }

}
