// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DissociateAclsFromListenerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DissociateAclsFromListenerResponseBody body;

    public static DissociateAclsFromListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateAclsFromListenerResponse self = new DissociateAclsFromListenerResponse();
        return TeaModel.build(map, self);
    }

    public DissociateAclsFromListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateAclsFromListenerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DissociateAclsFromListenerResponse setBody(DissociateAclsFromListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateAclsFromListenerResponseBody getBody() {
        return this.body;
    }

}
