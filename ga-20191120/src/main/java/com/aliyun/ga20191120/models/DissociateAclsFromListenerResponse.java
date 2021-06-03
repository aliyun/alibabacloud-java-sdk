// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DissociateAclsFromListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DissociateAclsFromListenerResponse setBody(DissociateAclsFromListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateAclsFromListenerResponseBody getBody() {
        return this.body;
    }

}
