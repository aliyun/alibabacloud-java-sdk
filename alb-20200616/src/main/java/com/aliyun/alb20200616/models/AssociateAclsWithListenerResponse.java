// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class AssociateAclsWithListenerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateAclsWithListenerResponseBody body;

    public static AssociateAclsWithListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateAclsWithListenerResponse self = new AssociateAclsWithListenerResponse();
        return TeaModel.build(map, self);
    }

    public AssociateAclsWithListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateAclsWithListenerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateAclsWithListenerResponse setBody(AssociateAclsWithListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateAclsWithListenerResponseBody getBody() {
        return this.body;
    }

}
