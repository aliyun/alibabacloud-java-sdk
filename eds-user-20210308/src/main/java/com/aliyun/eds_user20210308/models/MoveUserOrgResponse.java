// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class MoveUserOrgResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveUserOrgResponseBody body;

    public static MoveUserOrgResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveUserOrgResponse self = new MoveUserOrgResponse();
        return TeaModel.build(map, self);
    }

    public MoveUserOrgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveUserOrgResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveUserOrgResponse setBody(MoveUserOrgResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveUserOrgResponseBody getBody() {
        return this.body;
    }

}
