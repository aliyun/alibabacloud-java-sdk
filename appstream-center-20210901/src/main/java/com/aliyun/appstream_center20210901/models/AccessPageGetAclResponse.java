// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AccessPageGetAclResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AccessPageGetAclResponseBody body;

    public static AccessPageGetAclResponse build(java.util.Map<String, ?> map) throws Exception {
        AccessPageGetAclResponse self = new AccessPageGetAclResponse();
        return TeaModel.build(map, self);
    }

    public AccessPageGetAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AccessPageGetAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AccessPageGetAclResponse setBody(AccessPageGetAclResponseBody body) {
        this.body = body;
        return this;
    }
    public AccessPageGetAclResponseBody getBody() {
        return this.body;
    }

}
