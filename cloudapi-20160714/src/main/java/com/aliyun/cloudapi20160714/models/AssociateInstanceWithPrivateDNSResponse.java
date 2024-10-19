// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AssociateInstanceWithPrivateDNSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateInstanceWithPrivateDNSResponseBody body;

    public static AssociateInstanceWithPrivateDNSResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateInstanceWithPrivateDNSResponse self = new AssociateInstanceWithPrivateDNSResponse();
        return TeaModel.build(map, self);
    }

    public AssociateInstanceWithPrivateDNSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateInstanceWithPrivateDNSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateInstanceWithPrivateDNSResponse setBody(AssociateInstanceWithPrivateDNSResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateInstanceWithPrivateDNSResponseBody getBody() {
        return this.body;
    }

}
