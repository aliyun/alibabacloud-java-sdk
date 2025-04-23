// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class RemoveOrgResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveOrgResponseBody body;

    public static RemoveOrgResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveOrgResponse self = new RemoveOrgResponse();
        return TeaModel.build(map, self);
    }

    public RemoveOrgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveOrgResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveOrgResponse setBody(RemoveOrgResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveOrgResponseBody getBody() {
        return this.body;
    }

}
