// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AccessPageSetAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AccessPageSetAclResponseBody body;

    public static AccessPageSetAclResponse build(java.util.Map<String, ?> map) throws Exception {
        AccessPageSetAclResponse self = new AccessPageSetAclResponse();
        return TeaModel.build(map, self);
    }

    public AccessPageSetAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AccessPageSetAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AccessPageSetAclResponse setBody(AccessPageSetAclResponseBody body) {
        this.body = body;
        return this;
    }
    public AccessPageSetAclResponseBody getBody() {
        return this.body;
    }

}
